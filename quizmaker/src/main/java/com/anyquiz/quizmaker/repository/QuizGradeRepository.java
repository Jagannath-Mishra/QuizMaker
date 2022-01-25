package com.anyquiz.quizmaker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anyquiz.quizmaker.entity.QuizGrade;

public interface QuizGradeRepository extends JpaRepository<QuizGrade, Long> {

	@Query("SELECT q FROM QuizGrade q WHERE q.users.id = :id")
	List<QuizGrade> findByUserId(long id);

}
