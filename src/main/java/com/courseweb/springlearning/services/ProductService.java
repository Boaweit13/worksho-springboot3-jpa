package com.courseweb.springlearning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;*/
import org.springframework.stereotype.Service;

import com.courseweb.springlearning.entities.Product;
import com.courseweb.springlearning.repositories.ProductRepository;

@Service /* Pode-se definir como Repository ou component, dependo da função (Para integração com o spring*/
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
