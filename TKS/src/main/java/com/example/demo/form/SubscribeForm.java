package com.example.demo.form;

import lombok.Data;
/**
 * ログイン画面 form
 * 
 * @author reo1213
 *
 */
@Data
public class SubscribeForm {

	/** ログインID */
	private String UserId;
	
	/** メールアドレス */
	private String mailAddress;

	/** パスワード  */
	private String password;

}
