package com.courseweb.springlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.springlearning.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
