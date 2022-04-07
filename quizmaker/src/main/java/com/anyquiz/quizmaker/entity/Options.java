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
@Table(name = "options")
public class Options implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5870447442519274471L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String optionsName;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "question_id", referencedColumnName = "id", nullable = false)
	private Question questions;

	@Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 0")
	private boolean isCorrect;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOptionsName() {
		return optionsName;
	}

	public void setOptionsName(String optionsName) {
		this.optionsName = optionsName;
	}

	public Question getQuestions() {
		return questions;
	}

	public void setQuestions(Question questions) {
		this.questions = questions;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public Options(String optionsName, Question questions, boolean isCorrect) {
		super();
		this.optionsName = optionsName;
		this.questions = questions;
		this.isCorrect = isCorrect;
	}

	public Options() {
		super();
	}

	@Override
	public String toString() {
		return "Options [id=" + id + ", optionsName=" + optionsName + "]";
	}

}
