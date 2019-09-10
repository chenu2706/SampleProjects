package com.hungryTripperDemo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class CustomerForm {
	
	private int id;
	
	@NotNull(message="please enter Valid Firstname")
	private String firstName;
	@NotNull(message="please enter Valid Lastname")
	private String lastName;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Size(min=6,max=10,message="Please Enter a valid password")
	private String password;
	@NotNull
	@Size(min=10,max=12,message="Please Enter a valid Mobile Nuber")
	private String mobile_no;
	@NotNull
	private int active;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
}
	
	
	 
	