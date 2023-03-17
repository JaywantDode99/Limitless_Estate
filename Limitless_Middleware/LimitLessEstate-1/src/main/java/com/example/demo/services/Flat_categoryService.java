package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Flat_category;
import com.example.demo.entities.Role;
import com.example.demo.entities.Source;
import com.example.demo.repositories.Flat_categoryRepository;
import com.example.demo.repositories.SourceRepository;

@Service
public class Flat_categoryService {
	
	@Autowired
	Flat_categoryRepository fcrepo ;

	public List<Flat_category> getAll() {
		
		return fcrepo.findAll();
	}
	
	@Transactional
	public Flat_category save(Flat_category s)
	{
		return fcrepo.save(s);	
	}
	
	public Flat_category getFlat_category(int id) 
	{
		return fcrepo.findById(id).get();
	}

}
