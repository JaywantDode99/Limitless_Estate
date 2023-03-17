package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Flat_type;
import com.example.demo.entities.Role;
import com.example.demo.entities.Source;
import com.example.demo.repositories.Flat_typeRepository;
import com.example.demo.repositories.SourceRepository;

@Service
public class Flat_typeService 
{
	
	@Autowired
	Flat_typeRepository ftrepo ;

	public List<Flat_type> getAll() {
		
		return ftrepo.findAll();
	}
	
	@Transactional
	public Flat_type save(Flat_type s)
	{
		return ftrepo.save(s);	
	}
	
	public Flat_type getFlat_type(int id) 
	{
		return ftrepo.findById(id).get();
	}

}
