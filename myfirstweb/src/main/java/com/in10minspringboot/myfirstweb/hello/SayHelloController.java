package com.in10minspringboot.myfirstweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first page </title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("My first page");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	
	@RequestMapping("say-hello-jsp")
	//@ResponseBody
	public String sayHelloJsp() {
		return "login";
	}
}
