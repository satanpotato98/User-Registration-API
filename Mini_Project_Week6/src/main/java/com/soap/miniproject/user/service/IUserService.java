package com.soap.miniproject.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.soap.miniproject.user.entity.Users;
import com.soap.miniproject.user.exception.UserNotFoundException;

public interface IUserService {

	public Users adduser(Users user);
	public Users updateUser(Users user);
	public List<Users> getallUsers();
	public void deleteUser(int userId) throws UserNotFoundException;
	public Users findByusername(String username) throws UserNotFoundException;
	public Users findByuserId(int id) throws UserNotFoundException;
	public Users findByemail(String email) throws UserNotFoundException;
	public List<Users> addAll(List<Users> list);
	
}
