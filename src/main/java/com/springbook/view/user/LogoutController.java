package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//import deleted.com.springbook.view.controller.Controller;

public class LogoutController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("log out");
		
		HttpSession session=request.getSession();
		session.invalidate();
		
//		return "login";
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:login.jsp");
		return mav;
	}
	

}
