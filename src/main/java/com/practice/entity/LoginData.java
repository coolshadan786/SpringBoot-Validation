package com.practice.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "User name can not be empty !!!")
	@Size(min = 3,max = 12,message = "Username must be between 3-12 character")
	private String userName;
	
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message = "Invalid Email")			//@Pattern
	private String email;
	
	@AssertTrue(message = "Must agree terms and condition !!!")
	private boolean agreed;

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(
			@NotBlank(message = "User name can not be empty !!!") @Size(min = 3, max = 12, message = "Username must be between 3-12 character") String userName,
			@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email") String email,
			@AssertTrue boolean agreed) {
		super();
		this.userName = userName;
		this.email = email;
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	

}
