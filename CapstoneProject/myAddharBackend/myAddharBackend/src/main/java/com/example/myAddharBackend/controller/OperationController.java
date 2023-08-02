package com.example.myAddharBackend.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myAddharBackend.model.Login;
import com.example.myAddharBackend.service.LoginService;

@RestController
@RequestMapping("operation")
@CrossOrigin
public class OperationController {
	
	@Autowired
	LoginService ls;
	
	@PostMapping(value = "apply")
	public String apply(@RequestBody Login login) {
		return ls.storeUser(login);
	}
	
	@PatchMapping(value = "update")
	public String update(@RequestBody Login login) {
		return ls.update(login);
	}
	
	@GetMapping(value = "getAll")
	public List<Login> getAllUser(){
		return ls.getAll();
	}
	
	@GetMapping(value = "getUser/{id}")
	public List<Login> getOneUser(@PathVariable("id") int id){
		return ls.findById(id);
	}
	
	@DeleteMapping(value = "delete/{emailid}")
	public String deleteUser(@PathVariable("emailid") String emailid){
		return ls.delete(emailid);
	}
}