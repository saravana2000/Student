package com.project.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.model.user;
import com.project.backend.service.userservice;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class clientcontroler {
	
	@Autowired
	private userservice userservice;
	
	@GetMapping("/")
	public String hellowworld() {
		return "Hello World";
	}
	
	@PostMapping("/add")
	public String createuser(@RequestBody user user) {
		userservice.createUser(user);
		return "User Added Successfully";
	}
	
	@GetMapping("/users")
	public List<user> getUsers(){
		return userservice.getUser();
	}
	
	@PutMapping("/update/{id}")
	public String updateuserById(@PathVariable("id") int id,@RequestBody user user){
		 userservice.updateUser(id, user);
		 return "User Update Successsfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		 userservice.deleteUser(id);
		 return "User Deleted Successfully";
	}
	
	@GetMapping("/user/{id}")
	public user getUserById(@PathVariable("id")int id) {
		return userservice.getUserbyid(id);
	}
	
}
