package com.courseweb.springlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.springlearning.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
}
