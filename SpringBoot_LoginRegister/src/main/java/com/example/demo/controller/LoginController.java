package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
	
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("welcome")
	public String loginUser(@RequestParam String username,@RequestParam String password,Model model) {
		boolean isValidUser = service.validateUser(username,password);
		
		if(isValidUser) {
			model.addAttribute("message", "Login Successful");
			return "welcome";
		}else {
			model.addAttribute("Error", "Invalid Username or Password");
			return "login";
		}
	}
	
	@RequestMapping(value="register" , method=RequestMethod.GET)
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String name, @RequestParam String surname, Model model) {
		
		boolean isUserCreated = service.registerUser(username,password,name,surname);
		
		if (isUserCreated) {
			model.addAttribute("message", "Registration Successfull");
			return "welcome";
		}else {
			model.addAttribute("error", "Registration failed. User might already exist");
			return "register";
		}
	}
	
}
