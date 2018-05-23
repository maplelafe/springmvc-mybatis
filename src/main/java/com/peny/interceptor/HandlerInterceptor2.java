package com.peny.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义拦截器
 * @author acer
 *
 */
public class HandlerInterceptor2 implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 执行handler之前，用于身份认证，身份授权
		//认证不通过，拦截器，不再向下执行，false拦截，true通过
		System.out.println("HandlerInterceptor2 ..preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		// 执行handler后，返回ModelAndView之前，公用的模型数据传到视图（导航栏），也可以指定统一视图
		System.out.println("HandlerInterceptor2 ..postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 返回MOdleAndView后，统一的异常处理，日志处理
		System.out.println("HandlerInterceptor2 ..afterCompletion");
	}

}
