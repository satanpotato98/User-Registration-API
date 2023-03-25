package com.soap.miniproject.user.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.soap.miniproject.user.entity.Users;
import com.soap.miniproject.user.exception.UserNotFoundException;

@Repository
public interface IUserRepo extends MongoRepository<Users, Integer> {

	public Users findByusername(String username) throws UserNotFoundException;
	public Users findByuserId(int userId) throws UserNotFoundException;
	public Users findByemail(String email) throws UserNotFoundException;


}
