let button = docment.getElementById('btn');

button.addEventListener('click', function(event) {
	event.preventDefault();
	let userID = document.getElementById('userID').value;
	let password = document.getElementById('passWord').value;
	let mailAddress = document.getElementById('mailAddress').value;

	let formElement = document.form.login_form;
	let errorMessage = "";

	// UserID
	if (userID === "") {
		errorMessage += "User IDは必須項目です。\n";
	} else if (!/^[a-zA-Z0-9]+$/.test(userID)) {
		errorMessage += "User IDは半角英数字のみで入力してください。\n";
	} else if (userID.length > 10 || userID.length < 3) {
		errorMessage += "User IDは10文字以内で入力してください。\n";
	} else if (/[#$%&'()=~]/.test(userID)) {
		errorMessage += "User IDに特殊記号を使用しないでください。\n";
	}

	//password
	if (password === "") {
		errorMessage += "PassWordは必須項目です。\n";
	} else if (/[a-zA-Z0-9]/.test(password)) {
		errorMessage += "PasswordPassWordは半角英数字のみで入力してください。\n";
	} else if (password.length > 10 || password.length < 3) {
		errorMessage += "PassWordは10文字以内、3文字以上で入力してください。\n";
	} else if (!/[a-z]/.test(password) || !/[A-Z]/.test(password)) {
		errorMessage += "PassWordは大文字小文字数字を組み合わせて入力してください\n";
	} else if (/[#$%&'()=~]/.test(password)) {
		errorMessage += "PassWordは特殊記号を使用しないでください。\n";
	}

	//MailAddress
	if (mailAddress === "") {
		errorMessage += "MailAddressは必須項目です。\n"
	} else if (!/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/.test(mailAddress)) {
		errorMessage += "正しいMailAddress形式で入力してください。\n";
	} else if (/[^a-zA-Z0-9.@_%-+]/.test(mailAddress)) {
		errorMessage += "MailAddressは半角英数字のみで入力してください。\n";
	}

	if (errorMessage !== "") {
		alert(errorMessage);
		return false;
	} else {
		formElement.submit();
		return true;
	}


});
