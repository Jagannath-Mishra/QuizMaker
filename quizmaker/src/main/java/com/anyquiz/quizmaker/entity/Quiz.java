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
@Table(name = "quizs")
public class Quiz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6029493856861987578L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
	private User users;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "question_id", referencedColumnName = "id", nullable = false)
	private Question questions;

	private Long userOptionSelection;

	@Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 0")
	private boolean isSelectionCorrect;

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

	public Question getQuestions() {
		return questions;
	}

	public void setQuestions(Question questions) {
		this.questions = questions;
	}

	public Long getUserOptionSelection() {
		return userOptionSelection;
	}

	public void setUserOptionSelection(Long userOptionSelection) {
		this.userOptionSelection = userOptionSelection;
	}

	public boolean isSelectionCorrect() {
		return isSelectionCorrect;
	}

	public void setSelectionCorrect(boolean isSelectionCorrect) {
		this.isSelectionCorrect = isSelectionCorrect;
	}

}
