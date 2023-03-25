package com.soap.miniproject.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.miniproject.user.entity.Users;
import com.soap.miniproject.user.exception.UserNotFoundException;
import com.soap.miniproject.user.repo.IUserRepo;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepo repo;
	
	@Override
	public Users adduser(Users user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	@Override
	public List<Users> getallUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteUser(int userId) throws UserNotFoundException{
		// TODO Auto-generated method stub
		repo.deleteById(userId);
	}

	@Override
	public Users findByusername(String username) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return repo.findByusername(username);	}

	@Override
	public Users findByuserId(int id) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return repo.findByuserId(id);
	}

	@Override
	public Users findByemail(String email) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return repo.findByemail(email);
	}

	@Override
	public List<Users> addAll(List<Users> list) {
		// TODO Auto-generated method stub
		return repo.saveAll(list);
	}



}
