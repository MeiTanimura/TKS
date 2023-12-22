package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 Service
 * 
 * @author reo1213
 *
 */
@Service
@RequiredArgsConstructor
public class LoginService {

	/** ユーザー情報テーブルDAO */
	private final UsersRepository repository;

	/**
	 * ユーザー情報テーブルキー検索
	 * 
	 * @param userId ログインID
	 * @return 検索結果
	 */
	public Optional<Users> searchUserById(String userId) {
		return repository.findById(userId);
	}
}
