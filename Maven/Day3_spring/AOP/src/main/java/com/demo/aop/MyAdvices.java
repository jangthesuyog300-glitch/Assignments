package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvices {
	public void beforeAdvice() {
		System.out.println("in before advice");
	}
	
	public void afterAdvice() {
		System.out.println("in after advice");
	}
	
	public Object aroundadvice(ProceedingJoinPoint jpoint) throws Throwable {
		System.out.println("in around advice before function call");
		Object ob=jpoint.proceed();
		System.out.println("in around advice after function call");
		return ob;
	}

}
