package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// getter(), setter()を自動生成するアノテーション
@Data
// JPAのエンティティであることを示すアノテーション
@Entity
// エンティティに対応するテーブル名を指定。 "forums"部分はPostgreSQLで作成したテーブル名
@Table(name = "Users")
public class Forum {

    // エンティティの主キーを指定。今回であれば "id" カラムになる
	@Id
    // オートインクリメント。主キー "id" の値を自動採番する
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    // カラムに名前を付与
	@Column(name = "user_id")
	private Integer user_id;

	@Column(name = "email")
	private String email;

	@Column(name = "body")
	private String body;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "created_at")
	private String created_at;
	
	@Column(name = "team_id")
	private String team_id;
}

