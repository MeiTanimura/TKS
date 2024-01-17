package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SubscribeForm;
import com.example.demo.service.SubscribeService;

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
	private final SubscribeService service;
//
//	/** メッセージソース */
	private final MessageSource messageSource;

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
	@PostMapping("/top2")
	public String subscribe(Model model, SubscribeForm form) {
		var usersOpt = service.resistUsers(form);
		if(usersOpt.isEmpty()) {
//			var errorMsg = AppUtil.getMessage(messageSource, MessageConst, LOGIN_WRONG_INPUT);
//			model.addAttribute("message", errorMsg);
			return "subscribe";
		} else {
//			var message = AppUtil.getMessage(messageSource, null, null)
			return "redirect:/top2";
		}

	}
}

	// 新規会員画面から会員登録後トップ画面に遷移する
	// リダイレクト先のURLに対応するGetメソッドを追加する
	//	@GetMapping("topScreen2")
	//	public String topScreen2(Model model) {
	//		// TOP画面に表示する内容をモデルに設定する
	//		return "top";
	//	}
