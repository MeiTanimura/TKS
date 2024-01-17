package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;

/**
 * ユーザー情報テーブルDAO
 * 
 * @author reo1213
 *
 */

public interface UsersRepository extends JpaRepository<Users, String> {

	Users findByUserId(String userId);

	boolean existsByUserId(String userId);
}
