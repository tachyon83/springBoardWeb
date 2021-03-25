package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		// 1. Spring container
		AbstractApplicationContext container=new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. UserServiceImpl lookup
		UserService userService=(UserService)container.getBean("userService");
		
		UserVO vo=new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user=userService.getUser(vo);
		if(user!=null) {
			System.out.println(user.getName()+" logged in.");
		}else {
			System.out.println("failed to log in.");
		}
		
		container.close();
	}
	

}
