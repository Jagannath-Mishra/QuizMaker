package com.anyquiz.quizmaker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.anyquiz.quizmaker.entity.Test;
import com.anyquiz.quizmaker.repository.TestRepository;
import com.anyquiz.quizmaker.service.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@Autowired
	TestRepository testRepository;

	private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

	@GetMapping(value = "/quiz/{id}/start")
	public String startQuiz(@PathVariable("id") Long id, Model model) {
		Test test = testRepository.getById(id);
		if(test.isEnable()) {
		model.addAttribute("questions", questionService.getAllQuestions(id));
		model.addAttribute("endTime", test.getExamEndDateTime());
		//logger.info("Got all the questions {}", questionService.getAllQuestions(id));
		return "quiz";
		}else {
			return "test";
		}
	}

}
