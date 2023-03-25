package com.soap.miniproject.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<String>  handleExp(){
		
		return  new ResponseEntity<String>("User not found",HttpStatus.EXPECTATION_FAILED);
		
	}
}
