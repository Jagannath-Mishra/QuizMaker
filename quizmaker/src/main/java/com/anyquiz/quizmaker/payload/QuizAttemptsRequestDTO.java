package com.anyquiz.quizmaker.payload;

import com.anyquiz.quizmaker.entity.Options;
import com.anyquiz.quizmaker.entity.Question;
import com.anyquiz.quizmaker.entity.Test;
import com.anyquiz.quizmaker.entity.User;

public class QuizAttemptsRequestDTO {

	private User users;

	private Test tests;

	private Question questions;

	private Options options;

	private boolean attempt;

	private boolean isCorrect;

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Test getTests() {
		return tests;
	}

	public void setTests(Test tests) {
		this.tests = tests;
	}

	public Question getQuestions() {
		return questions;
	}

	public void setQuestions(Question questions) {
		this.questions = questions;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public boolean isAttempt() {
		return attempt;
	}

	public void setAttempt(boolean attempt) {
		this.attempt = attempt;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "QuizAttemptsRequestDTO [users=" + users + ", tests=" + tests + ", questions=" + questions + ", options="
				+ options + ", attempt=" + attempt + ", isCorrect=" + isCorrect + "]";
	}

}
