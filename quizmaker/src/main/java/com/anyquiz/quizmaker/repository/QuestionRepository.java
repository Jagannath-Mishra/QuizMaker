package com.anyquiz.quizmaker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anyquiz.quizmaker.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	@Query("SELECT q FROM Question q WHERE q.tests.id = :id")
	List<Question> findByTestId(long id);
}
