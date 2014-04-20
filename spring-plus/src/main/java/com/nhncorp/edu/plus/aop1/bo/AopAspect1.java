package com.nhncorp.edu.plus.aop1.bo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AopAspect1 {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Pointcut("execution(* com.nncorp.edu.plus.aop1.bo..*.*(..))")
	public void pointcut() {
		
	}
	
	@Before("pointcut()")
	public void before(JoinPoint joinPoint) throws Exception {
		logger.info("aopBO:before");
	}
	
	@After("pointcut()")
	public void after(JoinPoint joinPoint) throws Exception {
		logger.info("aopBO:after");
	}

}
