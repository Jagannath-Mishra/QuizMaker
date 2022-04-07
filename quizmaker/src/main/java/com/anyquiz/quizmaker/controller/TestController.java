package com.anyquiz.quizmaker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anyquiz.quizmaker.repository.QuizGradeRepository;
import com.anyquiz.quizmaker.service.SecurityService;
import com.anyquiz.quizmaker.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	QuizGradeRepository gradeRepository;

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/view/listTests")
	public String listStudent(Model model) {
		model.addAttribute("tests", testService.getAllTests());
		return "test";
	}

}
