package com.peny.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.peny.controller.validation.ValidGroup1;
import com.peny.exception.GoodException;
import com.peny.exception.GoodExceptionResovler;
import com.peny.po.GoodQueryVo;
import com.peny.po.GoodsCustom;
import com.peny.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsserice;
	//方法返回值返回到压面
	@ModelAttribute("goodtypes")
	public Map<String,String> getGoodType(){		
		Map<String,String> goodtype = new HashMap<String,String>();
		goodtype.put("1", "男");
		goodtype.put("2", "女");
		return goodtype;
		
	}
	
	
	@RequestMapping("/querygoods")
	public ModelAndView querygoods(HttpServletRequest request,GoodQueryVo vo) {
		ModelAndView model = new ModelAndView();
		//第一种参数绑定方式：System.out.println(request.getParameter("b"));	
		List<GoodsCustom> goods=goodsserice.findGoodsList(vo);
		model.addObject("goods", goods);
		model.setViewName("goodslist");
		return model;		
	}
	//required默认为true,http://localhost:8080/springmvc-mybatis-1/goods/querygoods 
//	@RequestMapping("/querygoods")
//	public ModelAndView querygoods(@RequestParam(value="goodsname",required=true,defaultValue="0") String name) {
//		//System.out.println(request.getParameter("b"));
//		ModelAndView model = new ModelAndView();
//		GoodQueryVo v = new GoodQueryVo();
//		GoodsCustom goodsCustom = new GoodsCustom();
//		goodsCustom.setGoodsname(name);
//		v.setGoodsCustom(goodsCustom);
//		List<GoodsCustom> goods=goodsserice.findGoodsList(v);
//		model.addObject("goods", goods);
//		model.setViewName("goodslist");
//		return model;		
//	}
	//处于安全考虑,限制http请求方法
	//跳转到更新页面
	@RequestMapping(value="/updategoods",method= {RequestMethod.POST,RequestMethod.GET})
	public String updategoods(Integer  goodsid,Model model) throws GoodException {
		GoodsCustom gc = new GoodsCustom();
		//查询单个商品
		gc=goodsserice.findGoodsById(goodsid);//简单类型绑定
		//系统自定义异常测试
		if(gc==null) {
			throw new GoodException("商品信息不存在！");
		}
		model.addAttribute("good",gc);
		return "update";		
	}
	//更新提交jsp @ModelAttribute("good")
	//bindingResult接受校验结果和@Validated 一对，顺序固定
	//(value= {ValidGroup1.class}) 用于分组校验
	//@ModelAttribute("good") 提交失败，pojo自动回显到页面中
	//good_pic 接受图片
	@RequestMapping(value="/updategoodssubmit",method= {RequestMethod.POST}) 
	public String updategoodssubmit(@ModelAttribute("good") @Validated(value= {ValidGroup1.class}) GoodsCustom good,BindingResult  bindingResult, 
			@RequestParam(value="goodsid",required=true,defaultValue="0") Integer goodsid,Model model,
			MultipartFile good_pic) throws GoodException, IllegalStateException, IOException {
		if(bindingResult.hasErrors()) {
			List<ObjectError> errorlist=bindingResult.getAllErrors();
			for (ObjectError error:errorlist) {
				System.out.println(error.getDefaultMessage());
			}
			model.addAttribute("errors", errorlist);
			model.addAttribute("goodsid", goodsid);
			return "update";
		}
		//上传图片
		String originfilename = good_pic.getOriginalFilename();
		if (good_pic !=null && originfilename !=null && originfilename.length()>0) {
			//指定物理路径
			String path="E:\\java培训资料\\网上商城视频\\springmvc\\picupload\\";
			//获取原始图片名称

			//保存为新的图片
			String newfilename=UUID.randomUUID().toString()+originfilename.substring(originfilename.indexOf("."));
			//新的图片
			File newfile = new File(path+newfilename);
			//内存中数据写入本地磁盘
			good_pic.transferTo(newfile);
			
			good.setPic(newfilename);
			
		}
		//修改商品
		boolean b =goodsserice.updateGoods(goodsid, good);	
		if (b == true) {
			return "redirect:querygoods";
		}
		return "fails";		
	}
	
	
	
	//处于安全考虑,限制http请求方法
	@RequestMapping(value="/deletegoods",method= {RequestMethod.POST })
	public String deletegoods(HttpServletRequest request,Integer [] goodsid,Model model) {
		GoodsCustom gc = new GoodsCustom();
		System.out.println("delete!");
		//boolean b=goodsserice.updateGoods(1, gc);
		//model.addAttribute("b", 1);
		//request.setAttribute("a", 2);
		//return "goods/delete";
		//return "redirect:querygoods";
		return "forward:querygoods";
	}
	
	//校验规则，页面内容校验（controller），业务层校验service
	@RequestMapping(value="/addgoods",method= {RequestMethod.POST})
	public String addgoods(HttpServletRequest request,Model model) {
		GoodsCustom gc = new GoodsCustom();
		return "forward:querygoods";
	}
	
	
//	//响应json数据
//	@RequestMapping(value="/jsongoods",method= {RequestMethod.POST,RequestMethod.GET})
//	public void Jsongoods(HttpServletRequest request,HttpServletResponse response,Model model) throws ServletException, IOException {
//		model.addAttribute("b", 1);
//		request.setAttribute("a", 2);
//		//request.getRequestDispatcher("querygoods").forward(request, response);
//		response.sendRedirect("querygoods");
//		response.setContentType("application/json;charset=utf-8");
//		response.setCharacterEncoding("utf-8");
//		String json="{'aaa':['a':'1']}";
//		response.getWriter().write(json);
//	}
	//url模板映射,"/jsongoods/{id}"表示将这个位置的参数传到 @PathVariable指定的名称中
	@RequestMapping(value="/jsongoods/{id}",method= {RequestMethod.POST,RequestMethod.GET})
	public @ResponseBody GoodsCustom Jsongoods(@PathVariable("id") Integer id)  {
		GoodsCustom gc = new GoodsCustom();
		//查询单个商品
		gc=goodsserice.findGoodsById(id);//简单类型绑定
		//系统自定义异常测试
		return gc;		
	}
	
}
