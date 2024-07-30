package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.loginmodel.LoginModel;
import com.example.demo.repoJPA.LoginRepoJPA;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepoJPA loginrepo;

	public boolean validateUser(String username, String password) {
			LoginModel user = loginrepo.findByUsername(username);
			return user != null && user.getPassword().equals(password);
	}
	public boolean registerUser (String username,String password,String name,String surname) {
		
		if(loginrepo.findByUsername(username)==null) {
			LoginModel newUser = new LoginModel();
			newUser.setUsername(username);
			newUser.setPassword(password);
			newUser.setName(name);
			newUser.setSurname(surname);
			loginrepo.save(newUser);
			return true;
		}
		return false;
	}

}
