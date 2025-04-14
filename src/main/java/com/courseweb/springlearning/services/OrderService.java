package com.courseweb.springlearning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;*/
import org.springframework.stereotype.Service;

import com.courseweb.springlearning.entities.Order;
import com.courseweb.springlearning.repositories.OrderRepository;

@Service /* Pode-se definir como Repository ou component, dependo da função (Para integração com o spring*/
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
