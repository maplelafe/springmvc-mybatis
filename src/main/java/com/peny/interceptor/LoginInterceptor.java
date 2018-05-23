package com.peny.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登录认证拦截器
 * @author acer
 *
 */
public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//获取请求url,查看url是否是公开地址
		String url = request.getRequestURI();
		//公开地址配置在文件中
		if(url.indexOf("login")>=0) {
			return true;
		}
		//获取session
		HttpSession sess =request.getSession(); 
		String username= (String) sess.getAttribute("username");
		if (username!=null) {
			return true;
		}
		
		//这里需要重定向到登录界面,
		request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		


	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
