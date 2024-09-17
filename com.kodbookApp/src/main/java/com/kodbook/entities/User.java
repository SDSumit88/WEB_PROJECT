package com.kodbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	private String username;
	private String email;
	private String password;
	private String gender;
	private String dob;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(long id, String username, String email, String password, String gender, String dob) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
	}
	public long getId() {
	
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", dob=" + dob + "]";
	}
}
