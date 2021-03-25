package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class AfterThrowingAdvice {
	
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()",throwing = "exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method=jp.getSignature().getName();
		System.out.println("[afterThrowing]: "+method+"() exception: "+exceptObj.getMessage());
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("err in advice: improper arg:"+exceptObj.getClass());
		}else if(exceptObj instanceof NumberFormatException) {
			System.out.println("err in advice: not an integer in seq.");
		}else System.out.println("err in advice: general err occurred."+exceptObj.getClass());
	}
}
