package com.peny.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GoodExceptionResovler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub
		//handler 就是处理器适配器要执行的handler
		 GoodException goodException = null ;
		//如果是系统自定义抛出的异常
		//如果不是构建未知错误
		if (ex instanceof GoodException ) {
			goodException= (GoodException)ex;
		}else {
			goodException=new GoodException("未知错误");
		}
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("message", goodException.getMessage());
		modelandview.setViewName("error");
		return modelandview;
	}

}
