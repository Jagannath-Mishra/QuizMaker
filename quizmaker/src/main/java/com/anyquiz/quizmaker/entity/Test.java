package com.anyquiz.quizmaker.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tests")
public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7740555969226879015L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String testName;

	private String testDescription;

	/** The created date. */

	@Column(name = "created_date", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(nullable = false, columnDefinition = "TINYINT(1) DEFAULT 0")
	private boolean isEnable;

	private Long totalQuestions;

	@Column(nullable = false, columnDefinition = "INT(10) DEFAULT 60")
	private Integer testTime;

	@Column(nullable = false, columnDefinition = "INT(10) DEFAULT 75")
	private int passPercentage;
	
	@Column(name = "exam_end_date_time", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date examEndDateTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDescription() {
		return testDescription;
	}

	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Long getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(Long totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	
	
	public Integer getTestTime() {
		return testTime;
	}

	public void setTestTime(Integer testTime) {
		this.testTime = testTime;
	}

	public int getPassPercentage() {
		return passPercentage;
	}

	public void setPassPercentage(int passPercentage) {
		this.passPercentage = passPercentage;
	}
	

	public Date getExamEndDateTime() {
		return examEndDateTime;
	}

	public void setExamEndDateTime(Date examEndDateTime) {
		this.examEndDateTime = examEndDateTime;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", testName=" + testName + ", testDescription=" + testDescription + ", createdDate="
				+ createdDate + ", isEnable=" + isEnable + ", totalQuestions=" + totalQuestions + ", testTime="
				+ testTime + "]";
	}

}
