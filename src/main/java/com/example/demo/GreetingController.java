package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {


	@GetMapping(value = {"/", "index"})
	public String index() {
		return "index";
	}


	@GetMapping("/register")
	public String register(Model model) {
		
		
		return "register";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		
		
		return "login";
	}


}