package com.soap.miniproject.user.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soap.miniproject.user.entity.Users;
import com.soap.miniproject.user.exception.UserNotFoundException;
import com.soap.miniproject.user.service.IUserService;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public Users addUser(@Valid @RequestBody Users user) {
		return service.adduser(user);
	}
	@PostMapping("/add/all")
	public List<Users> addAll(@RequestBody List<Users> users){
		return service.addAll(users);
	}
	
	
	@PutMapping("/update")
	public Users updateUser(@Valid @RequestBody Users user) {
		return service.updateUser(user);
	}
	
	@GetMapping(value="/getall", produces="application/xml")
	public List<Users> getAllUser(){
		return service.getallUsers();
	}
	
	@GetMapping("get/username/{username}")
	public Users getByusername(@PathVariable String username) throws UserNotFoundException {
		Users user=service.findByusername(username);
		if(user==null) {
			throw new UserNotFoundException();
		}
		return service.findByusername(username);
	}
	
	@GetMapping("/get/email/{email}")
	public Users findByemail(@PathVariable String email) throws UserNotFoundException {
		Users user=service.findByemail(email);
		if(user==null) {
			throw new UserNotFoundException();
		}
		else {
			return user;
		}
	}
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUserByid(@PathVariable Integer userId) throws UserNotFoundException{
		Users user=service.findByuserId(userId);
		if(user==null) {
			throw new UserNotFoundException();
		}
		else {
			service.deleteUser(userId);
			return new ResponseEntity<String>("User Deleted ",HttpStatus.OK);
		}
	}
	
	


}
