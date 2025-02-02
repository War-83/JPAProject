package com.example.demo.loginmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginModel {
	@Id
	private int id;
	private String username;
	private String password;
	private String name;
	private String surname;
	
	
	public LoginModel() {
		
	}
	
	public LoginModel(String username, String password, String name, String suername) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", surname=" + surname + "]";
	}
	
	
}
