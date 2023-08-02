package com.example.myAddharBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myAddharBackend.model.Login;
import com.example.myAddharBackend.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lr;
	
	public String signIn(Login login) {
		Optional<Login> result = lr.findById(login.getEmailid());
		if(result.isPresent()) {
					Login ll = result.get();
					if(ll.getPassword().equals(login.getPassword())) {		
						
						if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("admin")) {
							return "Admin sucessfully login";
						}else if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("user")){
							return "User successfully login";
						}else {
							return "Invalid details";
						}					
					}else {
						return "InValid password";
					}
		}else {
			return "InValid emailId";
		}	
	}
	
	
	public String signUp(Login login) {
		Optional<Login> result = lr.findById(login.getEmailid());
		if(result.isPresent()) {
					return "Email Id alreay exists";
		}else {
//			Login ll = result.get();
			if(login.getTypeOfUser().equals("admin")) {
				return "You can't create admin account";
			}else {
				lr.save(login);
				return "Account created successfully";
			}
			
		}	
	}
	
	public List<Login> getAll(){
		return lr.findAll();
	}
	
	public List<Login> findById(int id) {
		return lr.userById(id);
	}
	
	public String delete(String emailid) {
		Optional<Login> result = lr.findById(emailid);
		if(result.isPresent()) {
			Login l = result.get();
			lr.delete(l);
			return "User deleted successfully";
		}else {
			return "User with this id not present";
		}
	}
	
	public String update(Login login) {
		Optional<Login> result = lr.findById(login.getEmailid());
		if(result.isPresent()) {
			Login l = result.get();
			l.setAddress(login.getAddress());
			l.setDob(login.getDob());
			l.setPhone(login.getPhone());
			return "User updated successfully";
		}else {
			return "User with this id not present";
		}
	}
	
	public String storeUser(Login login) {
		lr.save(login);
		return "User applied for aadhar card";
	}
	
	public String note() {
		return "this is an application";
	}

}
