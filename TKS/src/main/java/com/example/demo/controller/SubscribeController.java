package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.form.LoginForm;

@Controller
public class SubscribeController {
	
	@GetMapping("/subscribe")
	public String view(Model model) {
		model.addAttribute("loginForm", new LoginForm());
		return "subscribe";
	}
	

}