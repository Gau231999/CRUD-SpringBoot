package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.user;
import com.example.demo.repository.repo_user;

@Service
public class Service_User {
	@Autowired
	private  repo_user repo;
	
	public List<user> saveAll(List<user> users)
	{
		return repo.saveAll(users);
	}
	public user save(user user)
	{
		return repo.save(user);
	}
	public  List<user> getusers()
	{
		return repo.findAll();
	}
	public user getUserById(int id)
	{
		return repo.findById(id).orElse(null);
		
	}

	public String deleteUser(int id)
	{
		repo.deleteById(id);
		return "product deleted"; 
	}
	public void UpdateUser(int id,user user)
	{
		user.setId(id);
	    repo.save(user);
	}
} 
