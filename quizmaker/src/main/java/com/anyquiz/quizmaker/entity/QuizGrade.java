package com.anyquiz.quizmaker.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "quiz_grades", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "test_id" }) })
public class QuizGrade implements Serializable {

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

	@Column(name = "total_score")
	private float score;

	@Column(name = "created_date", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

//	@Column(name="test_status", columnDefinition = "ENUM('PASS','FAIL') DEFAULT 'FAIL'")
//	@Enumerated(EnumType.STRING)
	@Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 0")
	private boolean testStatus;

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

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isTestStatus() {
		return testStatus;
	}

	public void setTestStatus(boolean testStatus) {
		this.testStatus = testStatus;
	}

	public QuizGrade(User users, Test tests, float score, boolean testStatus) {
		super();
		this.users = users;
		this.tests = tests;
		this.score = score;
		this.testStatus = testStatus;
	}

	@Override
	public String toString() {
		return "QuizGrade [id=" + id + ", users=" + users + ", tests=" + tests + ", score=" + score + ", createdDate="
				+ createdDate + ", testStatus=" + testStatus + "]";
	}

	public QuizGrade() {
		super();
	}

}
