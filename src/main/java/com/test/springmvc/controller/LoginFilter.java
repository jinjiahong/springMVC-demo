package com.test.springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class LoginFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 不过滤的uri
				String[] notFilter = new String[] { "login.jsp","login.html","welcome.jsp" };

				// 请求的uri
				String uri = request.getRequestURI();//uri = t/Login.jsp


				// 是否过滤
				boolean doFilter = true;
				for (String s : notFilter) {
					if (uri.indexOf(s) != -1) {
						// 如果uri中包含不过滤的uri，则不进行过滤
						doFilter = false;
						break;
					}
				}
				if (doFilter) {
					// 执行过滤
					// 从session中获取登录者实体
					Object obj = request.getSession().getAttribute("userName");
					if (null == obj) {
						// 如果session中不存在登录者实体，则弹出框提示重新登录
						// 设置request和response的字符集，防止乱码
						request.setCharacterEncoding("UTF-8");
//						response.setCharacterEncoding("UTF-8");//用setCharacterEncoding设置编码不起作用
						//text/html代表意义：指明这个是文本方式的网页文件，语言是 中文
						response.setContentType("text/html;charset=UTF-8");//加上alert中输出中文不乱码
						PrintWriter out = response.getWriter();
						String loginPage = "/t/login.jsp";
						StringBuilder builder = new StringBuilder();
						builder.append("<script type=\"text/javascript\">");
						builder.append("alert('登录超时或未登录，请重新登录！');");
						builder.append("window.top.location.href='");
						builder.append(loginPage);
						builder.append("';");
						builder.append("</script>");
						out.print(builder.toString());
//						response.sendRedirect("/t/login.jsp");//实现跳转
					} else {
						// 如果session中存在登录者实体，则继续
						filterChain.doFilter(request, response);
					}
				} else {
					// 如果不执行过滤，则继续
					filterChain.doFilter(request, response);
				}
	}

}
