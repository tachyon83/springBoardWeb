package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Log4jAdvice {
	@Before("PointcutCommon.getPointcut()")
	public void printLogging() {
		System.out.println("[common Log4j]: before business logic");
	}
}
