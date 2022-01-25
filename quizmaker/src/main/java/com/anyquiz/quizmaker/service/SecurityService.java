package com.anyquiz.quizmaker.service;

import com.anyquiz.quizmaker.entity.User;

public interface SecurityService {
	
	boolean isAuthenticated();

	void autoLogin(String username, String password);

	User getCurrentLoggedInUserDetails();
}