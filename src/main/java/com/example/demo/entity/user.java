package com.example.demo.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user {
	@Id
	@GeneratedValue
	private int id;
	private String name,email,jobtitle,phone,gender;
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(int id, String name, String email, String jobtitle, String phone, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.jobtitle = jobtitle;
		this.phone = phone;
		this.gender = gender;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
