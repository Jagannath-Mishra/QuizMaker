package com.anyquiz.quizmaker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anyquiz.quizmaker.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}
