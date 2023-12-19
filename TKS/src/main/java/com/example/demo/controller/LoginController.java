package com.example.demo.controller;

import org.springframework.context.MessageSource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.ErrorMessageConst;
import com.example.demo.form.LoginForm;
import com.example.demo.service.LoginService;
import com.example.demo.util.AppUtil;

import lombok.RequiredArgsConstructor;

/**
 * ログイン画面 Controller
 * 
 * @author reo1213
 *
 */
@Controller
@RequiredArgsConstructor
public class LoginController {

	/** ログイン画面 service*/
	private final LoginService service;
	
	/** PasswordEncoder */
	private final PasswordEncoder passwordEncoder;
	
	/** メッセージソース */
	private final MessageSource messageSource;

	/**
	 * 初期表示
	 *
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */
	@GetMapping("/login")
	public String login(Model model, LoginForm form) {
		return "login";
	}

	// ログイン画面からログインが完了した後にTOP画面に遷移する
	/**
	 * ログイン
	 * 
	 * @param model モデル
	 * @param form 入力情報
	 * @return 表示画面
	 */
	@PostMapping("/top")
	public String top(Model model, LoginForm form) {
		var users = service.searchUserById(form.getLoginId());
		// TODO パスワードはハッシュ化したものを使用する
		var isCorrectUserAuth = users.isPresent()
				&& passwordEncoder.matches(form.getPassword(), users.get().getPassword());
		if (isCorrectUserAuth) {
			return "redirect:/top";
		} else {
			//TODO エラーメッセージはプロパティで管理する
			var errorMsg = AppUtil.getMessage(messageSource,ErrorMessageConst.LOGIN_WRONG_INPUT);
			model.addAttribute("errorMdg", errorMsg);
			return "login";
		}

	}

	// 新規会員画面から会員登録後トップ画面に遷移する
	// リダイレクト先のURLに対応するGetメソッドを追加する
	//	@GetMapping("topScreen2")
	//	public String topScreen2(Model model) {
	//		// TOP画面に表示する内容をモデルに設定する
	//		return "top";
	//	}
}