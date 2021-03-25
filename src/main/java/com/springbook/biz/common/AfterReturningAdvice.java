package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	public void AfterReturningAdvice() {
		System.out.println("[AfterReturningAdvice] object created in memory.");
	}
	
	@AfterReturning(pointcut = "PointcutCommon.getPointcut()",returning = "returnObj")
	public void returnLog(JoinPoint jp,Object returnObj) {
		String method=jp.getSignature().getName();
		if(returnObj instanceof UserVO) {
			UserVO user=(UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println("[afterReturningAdvice]: "+user.getName()+" (admin)");
			}else {
				System.out.println("[afterReturningAdvice]: "+user.getName()+" (other roles)");
			}
		}else {
			System.out.println("[afterReturningAdvice]: return Type: "+returnObj.getClass());
			System.out.println("[afterReturningAdvice]: returnObj is not UserVO object.");
		}
		System.out.println("[afterReturning]: "+method+"() return: "+returnObj.toString());
	}

}
