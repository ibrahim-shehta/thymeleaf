package com.example.demo.modules.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

	@GetMapping("/login3542")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login2345")
	public void submitLogin(@ModelAttribute UserLogin userLogin) {
		
	}

}
