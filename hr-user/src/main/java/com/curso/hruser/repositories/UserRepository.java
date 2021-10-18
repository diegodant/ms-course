package com.curso.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
