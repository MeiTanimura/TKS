package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

/**
 * ユーザー情報テーブルDAO
 * 
 * @author reo1213
 *
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}
