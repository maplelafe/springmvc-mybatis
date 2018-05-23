package com.peny.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(HttpSession session, String username,String password) throws Exception{
		//调用service，用户身份验证
		session.setAttribute("username", username);
		
		//重定向页面
		return "redirect:/goods/querygoods";
	}
	
	//退出
	@RequestMapping("/logout")
	public String logout (HttpSession session) {
		
		//清除session
		session.invalidate();
		//重定向页面
		return "redirect:/goods/querygoods";
	}
}
