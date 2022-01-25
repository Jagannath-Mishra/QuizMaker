package com.anyquiz.quizmaker.service;

import com.anyquiz.quizmaker.entity.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);

	User findByEmail(String email);
}