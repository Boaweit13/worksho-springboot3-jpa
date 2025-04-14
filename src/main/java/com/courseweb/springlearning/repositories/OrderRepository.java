package com.courseweb.springlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.springlearning.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
