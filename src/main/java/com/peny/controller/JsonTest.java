package com.peny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peny.po.GoodsCustom;

//请求
@Controller
public class JsonTest {
	//请求json(商品信息),输出json
	@RequestMapping("/requestJson")
	public @ResponseBody GoodsCustom requestJson(@RequestBody GoodsCustom goodsCustom) {		
		return goodsCustom;		
	}
}
