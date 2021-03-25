package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
//	public void printLog() {
//		System.out.println("[common Log]: before business logic");
//	}
	
//	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//	public void allPointcut() {}
	
	@Before("PointcutCommon.allPointcut()")
	public void printLog(JoinPoint jp) {
		String method=jp.getSignature().getName();
		Object[] args=jp.getArgs();
		System.out.println("[사전처리]: "+method+"() args info: "+args[0].toString());
	}
}
