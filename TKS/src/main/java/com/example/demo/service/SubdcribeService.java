package com.example.demo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.form.SubscribeForm;
import com.example.demo.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

/**
 * 登録画面 Service
 * 
 * @author reo1213
 *
 */
@Service
@RequiredArgsConstructor
public class SubdcribeService {

	/** ユーザー情報テーブルDAO */
	private final UsersRepository repository;
	

	/** PasswordEncoder */
	private final PasswordEncoder passwordEncoder;
	

	/**
	 * ユーザー情報テーブル新規登録
	 * 
	 * @param form 入力情報
	 * @return 表示画面
	 */
	public Users resistUserById(SubscribeForm form) {
		var users = new Users();
		users.setUserId(form.getUserId());
		users.setPassword(form.getPassword());
		users.setEmail(form.getMailAddress());
		
		var encodedPassword = passwordEncoder.encode(form.getPassword());
		users.setPassword(encodedPassword);
		
		return repository.save(users);
	}
}
