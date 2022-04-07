package com.anyquiz.quizmaker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyquiz.quizmaker.entity.Test;
import com.anyquiz.quizmaker.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	@Override
	public List<Test> getAllTests() {
		List<Test> tests = new ArrayList<>();
		testRepository.findAll().forEach(tests::add);
		return tests;
	}

	@Override
	public Test Save(Test test) {
		return testRepository.save(test);
	}

	@Override
	public Test getTestById(Long id) {

		return testRepository.getById(id);
	}

	@Override
	public void delete(Long id) {
		testRepository.deleteById(id);

	}

}
