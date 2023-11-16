package com.example.demo.form;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Data;

@Data
public class IntroForm {
	private String name;
	private String kanaName;
	private String gender;
	private String[]inputHobbyCheck;
	public String[] getHobbyCheck() {
		return inputHobbyCheck;
	}
		
	public void setHobbyCheck(String[] inputHobbyCheck) {
		this.inputHobbyCheck = inputHobbyCheck;
	}
	//private String message;
	
	public Map<String, String> getGenderItems() {
		Map<String, String> genderMap = new LinkedHashMap<String, String>();
		genderMap.put("1", "男性");
		genderMap.put("2", "女性");
		return genderMap;
	}
	
	
}
