package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 * 
 * @author reo1213
 *
 */
@Entity
@Table(name = "Users")
@Data
public class Users {

	/** ログインID */
	@Id
	@Column(name = "user_id")
	private String userId;

	/** メールアドレス */
	@Column(name = "email")
	private String email;

	/** パスワード */
	@Column(name = "password")
	private String password;

	/** 取得日時 */
	@Column(name = "created_at")
	private Date createDate;

	@Column(name = "team_id")
	private String teamId;
}
