package com.in10min.myfirstweb.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public String sayLogin() {
		return "login";
	}

}
