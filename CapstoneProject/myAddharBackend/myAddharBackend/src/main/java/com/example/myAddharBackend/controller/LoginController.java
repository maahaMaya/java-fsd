package com.example.myAddharBackend.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myAddharBackend.model.Login;
import com.example.myAddharBackend.service.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@GetMapping(value = "note")
	public String note() {
		return ls.note();
	}
	
	@PostMapping(value = "signIn")
	public String signIn(@RequestBody Login login) {
		 System.out.println(login);
		return ls.signIn(login);
	}
	
	@PostMapping(value = "signUp")
	public String signUp(@RequestBody Login login) {
		return ls.signUp(login);
	}
	


}
