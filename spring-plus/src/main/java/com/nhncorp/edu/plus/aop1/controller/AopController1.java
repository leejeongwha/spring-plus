package com.nhncorp.edu.plus.aop1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nhncorp.edu.plus.aop.bo.AopBO;

@Controller
public class AopController1 {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AopBO aopBO;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@RequestMapping("/plus/aop1")
	public ModelAndView aop1() throws Exception {
		ModelAndView mav = new ModelAndView("/plus/hello");
		
		AopBO aopBO = applicationContext.getParent().getBean(AopBO.class);
		
		logger.info(this.aopBO + " : " + aopBO);
		
		mav.addObject("message", aopBO.getString());
		return mav;
	}
}

