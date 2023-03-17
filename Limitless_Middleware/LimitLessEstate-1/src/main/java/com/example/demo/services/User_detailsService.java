package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Address;
import com.example.demo.entities.Role;
import com.example.demo.entities.User_details;
import com.example.demo.repositories.User_detailsRepository;

@Service
public class User_detailsService {
	
	@Autowired
	User_detailsRepository urepo ;
	
	public User_details checkLogin (String email , String pwd)
	{
		User_details u;
		Optional<User_details> o1 = urepo.checkLogin(email, pwd);
		
		try {
			u=o1.get();
			System.out.println("services - "+u);
		}
		catch (Exception e)
		{
			u=null;
		}
		return u;
	}
	
	public List<User_details> getAll()
	{
		return urepo.findAll();	
	}
	
	@Transactional
	public User_details save(User_details a)
	{
		return urepo.save(a);	
	}
	
	
	public User_details getById(int id) {
		
		return urepo.findById(id).get();
	}

	public List<User_details> getUser_detailsByStatus(int id)
	{
		
		return urepo.getUser_detailsByStatus(id);
	}

	public int updateUser_detailsByStatus(int id) 
	{
		
		return urepo.updateUser_detailsByStatus(id);
	}

	public User_details getQuestionByUserName(String name) 
	{
		
		return urepo.getQuestionByUserName(name);
	}
	
	public int resetPassword(int id,String password)
	{
		return urepo.resetPassword(id,password);
	}

	
}
