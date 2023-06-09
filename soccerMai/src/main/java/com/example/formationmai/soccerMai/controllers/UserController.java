package com.example.formationmai.soccerMai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.formationmai.soccerMai.models.User;
import com.example.formationmai.soccerMai.services.UserService;

@RequestMapping("users")
@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping
	public List<User> getAll(){
    return userService.getAllUsers();
    
    }
	
	@GetMapping("/{id}")
	public User getById(@PathVariable Long id) {
		
	return userService.getUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		
   	userService.deleteUserById(id);	
	}
	
	@PostMapping
	public User addUser(@RequestBody User user) {

	return userService.addUser(user);
}
	

}
