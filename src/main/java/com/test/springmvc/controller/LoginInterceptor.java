package com.test.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	@Resource
	HttpServletRequest request;
	HttpServletResponse response;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		//全部完成后处理（即在pre和post之后处理）
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		//拦截后处理
		response.sendRedirect("/login.jsp");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//拦截前处理
		  String str = (String) request.getSession().getAttribute("isLogin");  
	        System.out.println("str=========>"+str);  
	        if(str!=null){  
	            return true;  
	        }  
	        return false;  
	}

}
