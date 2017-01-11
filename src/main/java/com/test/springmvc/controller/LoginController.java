package com.test.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import com.test.springmvc.service.LoginService;

@Controller
public class LoginController {
	@Resource
	LoginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("index")
	public ModelAndView toLoginPage(){
		return new ModelAndView("login.jsp");
	}
	
	@RequestMapping("login")
	public ModelAndView doLogin(){
		 //在Session里保存信息  
		String loginPageUrl = "login.jsp";
		String successPageUrl = "welcome.jsp";
		
		String uname = request.getParameter("userName");
		String upassword = request.getParameter("password");
		
		return service.doLogin(loginPageUrl,successPageUrl,uname,upassword);
	}
}
