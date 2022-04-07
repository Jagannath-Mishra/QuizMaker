package com.anyquiz.quizmaker.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.anyquiz.quizmaker.entity.Options;
import com.anyquiz.quizmaker.entity.Question;
import com.anyquiz.quizmaker.entity.QuizAttempt;
import com.anyquiz.quizmaker.entity.QuizGrade;
import com.anyquiz.quizmaker.entity.Test;
import com.anyquiz.quizmaker.entity.User;
import com.anyquiz.quizmaker.repository.OptionRepository;
import com.anyquiz.quizmaker.repository.QuestionRepository;
import com.anyquiz.quizmaker.repository.QuizAttemptRepository;
import com.anyquiz.quizmaker.repository.QuizGradeRepository;
import com.anyquiz.quizmaker.repository.TestRepository;
import com.anyquiz.quizmaker.service.SecurityService;

@Controller
public class QuizAttemptController {

	private static final Logger logger = LoggerFactory.getLogger(QuizAttemptController.class);

	@Autowired
	private SecurityService securityService;

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private OptionRepository optionRepository;

	@Autowired
	private QuizAttemptRepository quizAttemptRepository;

	@Autowired
	private QuizGradeRepository quizGradeRepository;

	@PostMapping("/submit-result")
	public String doTest(@RequestParam HashMap<String, String> listOfParams, RedirectAttributes redirectAttributes) {
		listOfParams.remove("_csrf");
		User loggedInUser = securityService.getCurrentLoggedInUserDetails();
		Question questionFirst = questionRepository
				.getById(Long.parseLong((String) listOfParams.keySet().stream().findFirst().get()));
		Test tests = testRepository.getById(questionFirst.getTests().getId());
		float singleQuestionMarkValue = 0.0f;
		singleQuestionMarkValue = (100 / listOfParams.size());
		float totalScore = 0.0f;
		for (Map.Entry mapElement : listOfParams.entrySet()) {
			Long questionId = Long.parseLong((String) mapElement.getKey());
			Question question = questionRepository.getById(questionId);
			// Adding some bonus marks to all the students
			Long optionId = Long.parseLong((String) mapElement.getValue());
			Options optionBean = optionRepository.getById(optionId);
			QuizAttempt quizAttempt = new QuizAttempt(loggedInUser, tests, question, optionBean, true,
					optionBean.isCorrect());
			logger.info("Final result : {}", quizAttempt.toString());
			quizAttemptRepository.save(quizAttempt);

			if (optionBean.isCorrect()) {
				totalScore += singleQuestionMarkValue;
			}
		}
		boolean testStatus = (totalScore >= tests.getPassPercentage());
		logger.info("status {} {} {} {}", loggedInUser, tests, totalScore, testStatus);
		quizGradeRepository.save(new QuizGrade(loggedInUser, tests, totalScore, testStatus));

		return "redirect:/view/results";
	}

	@GetMapping("/view/results")
	public String viewResult(Model model) {
		User loggedInUser = securityService.getCurrentLoggedInUserDetails();
		model.addAttribute("results", quizGradeRepository.findByUserId(loggedInUser.getId()));
		logger.info("Got all the answar {}", quizGradeRepository.findByUserId(loggedInUser.getId()));
		return "result";
	}
}
