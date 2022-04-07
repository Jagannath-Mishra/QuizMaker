package com.anyquiz.quizmaker.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quiz_attempts")
public class QuizAttempt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7815394849611378417L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
	private User users;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "test_id", referencedColumnName = "id", nullable = false)
	private Test tests;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "question_id", referencedColumnName = "id", nullable = false)
	private Question questions;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "option_id", referencedColumnName = "id", nullable = false)
	private Options options;

	@Column(name = "attempts", columnDefinition = "TINYINT(1) default 1 ")
	private boolean attempt;

	@Column(name = "is_correct", columnDefinition = "TINYINT(1) default 1 ")
	private boolean isCorrect;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public QuizAttempt(User users, Test tests, Question questions, Options options, boolean attempt,
			boolean isCorrect) {
		super();
		this.users = users;
		this.tests = tests;
		this.questions = questions;
		this.options = options;
		this.attempt = attempt;
		this.isCorrect = isCorrect;
	}

}
