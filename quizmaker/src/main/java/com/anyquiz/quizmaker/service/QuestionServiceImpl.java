package com.anyquiz.quizmaker.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anyquiz.quizmaker.entity.Question;
import com.anyquiz.quizmaker.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public HashSet<Question> getAllQuestions(Long testId) {

		HashSet<Question> questions = new HashSet<>();
		questionRepository.findByTestId(testId).forEach(questions::add);

		return questions;
	}

	@Override
	public Question save(Question question) {
		return questionRepository.save(question);
	}

}
