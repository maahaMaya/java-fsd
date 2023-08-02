package com.example.myAddharBackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	private String emailid;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String password;
	@Column(name = "typeofuser")
	private String typeOfUser;
	
	private String name;
	private String address;
	private double phone;
	private String dob;
	
	
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	
	public Login(int id, String emailid, String password, String typeOfUser, String name, String address, double phone,
			String dob) {
		super();
		this.id = id;
		this.emailid = emailid;
		this.password = password;
		this.typeOfUser = typeOfUser;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", emailid=" + emailid + ", password=" + password + ", typeOfUser=" + typeOfUser
				+ ", name=" + name + ", address=" + address + ", phone=" + phone + ", dob=" + dob + "]";
	}
	
	

}
