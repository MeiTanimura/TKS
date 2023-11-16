package com.example.demo.controller;

//import java.util.LinkedHashMap;
//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.IntroForm;

@Controller
public class IntroController {

	@GetMapping("/introform")
	private String readForm(Model model, IntroForm introForm) {
		return "introform";
	}
	
	@PostMapping("/introform")
	private String confirm(Model model, IntroForm introForm) {
		return "introconfirm";

	}
	
	@RequestMapping("/css")
	public String sample (Model model,IntroForm introForm) {
		return "css";
	}
}