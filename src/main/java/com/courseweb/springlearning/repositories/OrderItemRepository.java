package com.courseweb.springlearning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseweb.springlearning.entities.OrderItem;
import com.courseweb.springlearning.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
