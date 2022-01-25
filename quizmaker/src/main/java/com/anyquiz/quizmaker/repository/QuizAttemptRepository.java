package com.anyquiz.quizmaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anyquiz.quizmaker.entity.QuizAttempt;

public interface QuizAttemptRepository extends JpaRepository<QuizAttempt, Long> {

}
