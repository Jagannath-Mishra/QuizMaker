package com.anyquiz.quizmaker.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5906722538809708441L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "question_name", columnDefinition = "MEDIUMTEXT")
	private String questionName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "test_id", referencedColumnName = "id", nullable = false)
	private Test tests;

	@OneToMany(mappedBy = "questions", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Options> options;

	public Set<Options> getOptions() {
		return options;
	}

	public void setOptions(Set<Options> options) {
		this.options = options;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Test getTests() {
		return tests;
	}

	public void setTests(Test tests) {
		this.tests = tests;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", questionName=" + questionName + ", tests=" + tests + ", options=" + options
				+ "]";
	}

}
