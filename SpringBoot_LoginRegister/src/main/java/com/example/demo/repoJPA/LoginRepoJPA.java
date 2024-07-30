package com.example.demo.repoJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.loginmodel.LoginModel;

@Repository
	public interface LoginRepoJPA extends JpaRepository<LoginModel,Integer>{
			LoginModel findByUsername(String username);
	}
