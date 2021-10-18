package com.curso.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.hruser.entities.User;
import com.curso.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository; 

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findbyId(@PathVariable Long id){
		User obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findbyEmail(@RequestParam String email){
		User obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}
}

