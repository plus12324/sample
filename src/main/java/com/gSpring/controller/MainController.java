package com.gSpring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	private Logger logger = Logger.getLogger(getClass());
	
	
	@RequestMapping(value = "/home")
	public String home(final HttpServletRequest servletRequest, HttpServletResponse res,ModelMap mMap) {
		
		logger.info("메인화면 Controller");		
				
		return "home";
	}
	
	@RequestMapping(value = "/home")
	public void home(final HttpServletRequest servletRequest, HttpServletResponse res,ModelMap mMap) {
		
		logger.info("메인화면 Controller");		
				
		return "home";
	}
}
