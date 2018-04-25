package com.peny.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.peny.po.GoodQueryVo;
import com.peny.po.GoodsCustom;
import com.peny.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsserice;

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
	public String updategoods(Integer  goodsid,Model model) {
		GoodsCustom gc = new GoodsCustom();
		//查询单个商品
		gc=goodsserice.findGoodsById(goodsid);//简单类型绑定	
		model.addAttribute("good",gc);
		return "update";		
	}
	//更新提交 @ModelAttribute("good")
	@RequestMapping(value="/updategoodssubmit",method= {RequestMethod.POST}) 
	public String updategoodssubmit(GoodsCustom good,@RequestParam(value="goodsid",required=true,defaultValue="0") Integer goodsid,Model model) {
		//修改商品
		boolean b =goodsserice.updateGoods(goodsid, good);	
		if (b == true) {
			return "redirect:querygoods";
		}
		return "fails";		
	}
	
	
	
	//处于安全考虑,限制http请求方法
	@RequestMapping(value="/deletegoods",method= {RequestMethod.POST})
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
	//响应json数据
	@RequestMapping(value="/jsongoods",method= {RequestMethod.POST,RequestMethod.GET})
	public void Jsongoods(HttpServletRequest request,HttpServletResponse response,Model model) throws ServletException, IOException {
		model.addAttribute("b", 1);
		request.setAttribute("a", 2);
		//request.getRequestDispatcher("querygoods").forward(request, response);
		response.sendRedirect("querygoods");
		response.setContentType("application/json;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		String json="{'aaa':['a':'1']}";
		response.getWriter().write(json);


	}
	
}
