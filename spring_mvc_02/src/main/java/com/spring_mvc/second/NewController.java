package com.spring_mvc.second;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewController {
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/myView")
	public String myView() {
		
		return "jsp/myView";
	}
}
