package com.soap.miniproject.user.entity;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection= "user")
public class Users {

	
	@MongoId 
	private int userId;
	@NotNull(message="username is required")
	private String username;
	private String password;
	@Email(message = "Email should be in email format")
	private String email;
	@Past(message = "DoB should be past date")
	private LocalDate dob;
	@NotNull(message = " contact is required")
	private String contactnumber;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String username, String password, String email, LocalDate dob, String contactnumber) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", dob=" + dob + ", contactnumber=" + contactnumber + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	
	
}
