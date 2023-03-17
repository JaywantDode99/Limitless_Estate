package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.example.demo.entities.Role;
import com.example.demo.entities.Favourite;
import com.example.demo.entities.Projects;
import com.example.demo.entities.User_details;
import com.example.demo.repositories.FavouriteRepository;

@Service
public class FavouriteService {
	
	@Autowired
	FavouriteRepository frepo ;

	public List<Favourite> getAll() {
		
		return frepo.findAll();
	}
	
	@Transactional
	public Favourite save(Favourite s)
	{
		return frepo.save(s);	
	}
	
	public Favourite getFavourite(int id) 
	{
		return frepo.findById(id).get();
	}

	public List<Favourite> getDetailsById(User_details login_id) 
	{
		
		return frepo.getDetailsById(login_id);
	}

	public Favourite findByLoginId(User_details loginId,Projects projectId) 
	{
		return frepo.getByLoginId(loginId,projectId);
	}

	public List<Projects> getFavoriteProjects(User_details id) {
		
		return frepo.getFavoriteProjects(id);
	}
}
