package com.courseweb.springlearning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;*/
import org.springframework.stereotype.Service;

import com.courseweb.springlearning.entities.User;
import com.courseweb.springlearning.repositories.UserRepository;

@Service /* Pode-se definir como Repository ou component, dependo da função (Para integração com o spring*/
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
