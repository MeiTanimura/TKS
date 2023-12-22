package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SubscribeForm;
import com.example.demo.service.SubdcribeService;

import lombok.RequiredArgsConstructor;

/**
 * 登録画面 Controller
 * 
 * @author reo1213
 *
 */
@Controller
@RequiredArgsConstructor
public class SubscribeController {

	/** 登録画面 service*/
	private final SubdcribeService service;
//
//	/** メッセージソース */
//	private final MessageSource messageSource;

	/**
	 * 初期表示
	 *
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */
	@GetMapping("/subscribe")
	public String top(Model model, SubscribeForm form) {
		return "subscribe";
	}

	// ログイン画面からログインが完了した後にTOP画面に遷移する
	/**
	 * ユーザー登録画面
	 * 
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */
	@PostMapping("/subscribe")
	public void subscribe(Model model, SubscribeForm form) {
		var users = service.resistUserById(form);

	}
}

	// 新規会員画面から会員登録後トップ画面に遷移する
	// リダイレクト先のURLに対応するGetメソッドを追加する
	//	@GetMapping("topScreen2")
	//	public String topScreen2(Model model) {
	//		// TOP画面に表示する内容をモデルに設定する
	//		return "top";
	//	}
