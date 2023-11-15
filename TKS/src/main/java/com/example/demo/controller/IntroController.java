package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.IntroForm;

@Controller
public class IntroController {

	@GetMapping("/introform")
	private String readForm(Model model, IntroForm introForm) {
		model.addAttribute("checkboxItems", getHobbyItems());
		return "introform";
	}

	public Map<String, String> getGenderItems() {
		Map<String, String> genderMap = new LinkedHashMap<String, String>();
		genderMap.put("1", "男性");
		genderMap.put("2", "女性");
		return genderMap;
	}

	private Map<String, String> getHobbyItems() {
		Map<String, String> checkBoxHobby = new LinkedHashMap<String, String>();
		checkBoxHobby.put("1", "項目1");
		checkBoxHobby.put("2", "項目2");
		checkBoxHobby.put("3", "項目3");
		return checkBoxHobby;
	}

	@PostMapping("/introform")
	private String confirm(Model model, IntroForm introForm) {
		return "introconfirm";

	}
}