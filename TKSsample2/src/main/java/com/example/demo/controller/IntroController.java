package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.IntroForm;

@Controller
public class IntroController {

	private Object hobby;

	@GetMapping("/introform")
	public String readForm(Model model, IntroForm introForm) {
		 model.addAttribute("hobbyCheckBox",getCheckBoxHobby());
		    model.addAttribute("hobby",hobby);
		return "introform";
	}
	
	 private Map<String ,String> getCheckBoxHobby(){
	     
		    Map<String, String> checkBoxHobby = new LinkedHashMap<String , String>();
		     
		    checkBoxHobby.put("項目1", "項目");
		    checkBoxHobby.put("項目2", "項目");
		    checkBoxHobby.put("項目3", "項目");
		    return checkBoxHobby;
		  }
	@PostMapping("/introconfirm")
	private String confirm(Model model, IntroForm introForm) {
		 model.addAttribute("hobby",introForm.getSelectHobbys());
		return "introconfirm";

	}
	
	@RequestMapping("/css")
	public String sample (Model model,IntroForm introForm) {
		return "css";
	}
	

}