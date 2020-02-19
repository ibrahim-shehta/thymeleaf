package com.example.demo.modules;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/fsdf")
	public String root() {
		return "index";
	}

	@GetMapping("/user")
	public String userIndex() {
		return "user/index";
	}

	@GetMapping("/login2")
	public String login() {
		return "login";
	}

	@GetMapping("/access-denied")
	public String accessDenied() {
		return "/error/access-denied";
	}

}
