package com.in10min.myfirstweb.login;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	
	
//	private Logger logger = LoggerFactory.getLogger(getClass());


	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		
//		logger.debug("Request param is {}",name);
//		logger.info("I want this printed at info level");
		model.put("name",getLoggedinUsername() );
		return "Welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = 
		SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	

}
