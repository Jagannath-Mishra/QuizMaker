package com.anyquiz.quizmaker.service;

import java.util.List;

import com.anyquiz.quizmaker.entity.Test;

public interface TestService {

	List<Test> getAllTests();

	Test Save(Test test);

	Test getTestById(Long id);

	void delete(Long id);
}
