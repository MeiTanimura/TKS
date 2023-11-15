package com.example.demo.form;

//import java.util.LinkedHashMap;
//import java.util.Map;

import lombok.Data;

@Data
public class IntroForm {
	private String name;
	private String kanaName;
	private String gender;

	private String[] inputHobbyCheck;

	public String[] getHobbyCheck() {
		return inputHobbyCheck;
	}

	public void setHobbyCheck(String[] inputHobbyCheck) {
		this.inputHobbyCheck = inputHobbyCheck;
	}
	//private String message;

}