package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.service.Service_User;


@CrossOrigin("http://localhost:4200")
@RestController
public class Controller_User {
	@Autowired
	private Service_User service;
	
	
	@PostMapping("/api_user_save")
	public user users( @RequestBody user user) {
		return service.save(user);
	}

	@GetMapping("/api_user_get")
	public List<user> getData() {
		return service.getusers();
	}
	
	@GetMapping("/api_user_get/{id}")
	public user 	getUserById(@PathVariable int id)
	{
		user user =  service.getUserById(id);
		return user;
	}
	
	@DeleteMapping("/api_user_delete/{id}")
	public String 	deleteUser(@PathVariable int id)
	{
		String user =  service.deleteUser(id);
		return user;
	}
	
	@PutMapping("/api_user_update/{id}")
	public  String 	updateStudent(@PathVariable int id,@RequestBody user user)
	{
		System.out.println(id + "    " +user.getEmail());
		service.UpdateUser(id,user);
		return "update";
	}
}
