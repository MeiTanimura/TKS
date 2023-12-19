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
	private String loginId;
	
	/** メールアドレス */
	private String mailAddress;

	/** パスワード  */
	private String password;

}
