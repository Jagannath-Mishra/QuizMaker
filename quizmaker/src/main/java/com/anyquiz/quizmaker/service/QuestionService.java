package com.anyquiz.quizmaker.service;

import java.util.HashSet;

import com.anyquiz.quizmaker.entity.Question;

public interface QuestionService {

	HashSet<Question> getAllQuestions(Long testId);

}
