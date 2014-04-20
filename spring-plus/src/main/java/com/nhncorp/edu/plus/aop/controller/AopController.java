package com.nhncorp.edu.plus.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nhncorp.edu.plus.aop.bo.AopBO;

@Controller
public class AopController {
	@Autowired
	private AopBO aopBO;
	
	@RequestMapping("/plus/aop")
	public ModelAndView aop1() throws Exception {
		ModelAndView mav = new ModelAndView("/plus/hello");
		
		mav.addObject("message", aopBO.getString());
		return mav;
	}
}