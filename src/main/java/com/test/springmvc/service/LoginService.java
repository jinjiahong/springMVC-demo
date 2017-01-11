package com.test.springmvc.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {
	@Resource
	HttpSession session;
	
	public ModelAndView doLogin(String loginPageUrl,String successPageUrl,String uname,String upassword){
		//校验用户名和密码是否为空
		if("".equals(uname) || null == uname){
			return new ModelAndView(loginPageUrl,"error","用户名不能为空");
		}
		
		if("".equals(upassword) || null == upassword){
			return new ModelAndView(loginPageUrl,"error","密码不能为空");
		}
		
		//假设用户名为 admin  密码为 123
		if("admin".equals(uname)){
			if("123".equals(upassword)){
				session.setAttribute("userName", uname); 
				return new ModelAndView(successPageUrl);
			}else{
				return new ModelAndView(loginPageUrl,"error","密码不正确");//login.jsp可带信息因为jsp页面上有输出
			}
		}else{
			return new ModelAndView(loginPageUrl,"error","用户名还没注册");
		}
	}
}
