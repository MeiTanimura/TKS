package com.example.demo.form;

import lombok.Data;
/**
 * ログイン画面 form
 * 
 * @author reo1213
 *
 */
@Data
public class LoginForm {

	/** ログインID */
	private String userId;

	/** パスワード  */
	private String password;

}
