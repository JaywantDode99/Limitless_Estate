package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Role;
import com.example.demo.entities.Source;
import com.example.demo.repositories.SourceRepository;

@Service
public class SourceService {
	
	@Autowired
	SourceRepository srepo ;

	public List<Source> getAll() {
		
		return srepo.findAll();
	}
	
	@Transactional
	public Source save(Source s)
	{
		return srepo.save(s);	
	}
	
	public Source getSource(int id) 
	{
		return srepo.findById(id).get();
	}

}
