package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.mvc.AbstractController;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//@EnableWebMvc
public class LoginController implements Controller {
//public class LoginController extends AbstractController {
	
//	public void LoginController() {
//		System.out.println("Login Controller instance created");
//	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Login handling");
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		
		UserVO vo=new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO=new UserDAO();
		UserVO user=userDAO.getUser(vo);
		
		//if(user!=null)return "getBoardList.do";
		//else return "login";
		
		ModelAndView mav=new ModelAndView();
		if(user!=null) {
			System.out.println(user.toString());
			mav.setViewName("redirect:getBoardList.do");
		}
		else mav.setViewName("redirect:login.jsp");
		return mav;
	}

//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		System.out.println("Login handling");
//		
//		String id=request.getParameter("id");
//		String password=request.getParameter("password");
//		
//		UserVO vo=new UserVO();
//		vo.setId(id);
//		vo.setPassword(password);
//		
//		UserDAO userDAO=new UserDAO();
//		UserVO user=userDAO.getUser(vo);
//		
//		//if(user!=null)return "getBoardList.do";
//		//else return "login";
//		
//		System.out.println(user.toString());
//		
//		ModelAndView mav=new ModelAndView();
//////		if(user!=null)mav.setViewName("redirect:getBoardList.do");
////		if(user!=null) {
////			mav.setViewName("getBoardList.do");
////		}
//////		else mav.setViewName("redirect:login.jsp");
////		else mav.setViewName("login.jsp");
//		
//		mav.setViewName("getBoardList.do");
//		return mav;
//	}

}
