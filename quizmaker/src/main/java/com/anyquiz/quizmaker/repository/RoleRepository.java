package com.anyquiz.quizmaker.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anyquiz.quizmaker.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Set<Role> findByName(String string);

}
