package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.modules.user.model.User;
import com.example.demo.modules.user.service.UserService;

@Controller
public class GreetingController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/greeting2")
	public String greeting2(Model model) {
		
		 Optional<User> user =  userServiceImpl.findById(1);
		model.addAttribute("name", user.get().getUsername());
		return "greeting";
	}

}