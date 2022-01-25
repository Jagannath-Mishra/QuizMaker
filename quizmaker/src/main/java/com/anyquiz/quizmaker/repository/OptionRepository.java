package com.anyquiz.quizmaker.repository;

import java.util.HashSet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anyquiz.quizmaker.entity.Options;

public interface OptionRepository extends JpaRepository<Options, Long> {

	@Query("SELECT o FROM Options o WHERE o.questions.id = :id")
	HashSet<Options> findByQuestionsId(long id);
}
