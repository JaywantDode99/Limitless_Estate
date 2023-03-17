package com.example.demo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Flat_type;
import com.example.demo.entities.Role;
import com.example.demo.services.Flat_typeService;
import com.example.demo.services.RoleService;


@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class Flat_typeController {
	
	@Autowired
	Flat_typeService ftservice ;

	
	@GetMapping("/alltypes")
	public List<Flat_type> getAll()
	{
		return ftservice.getAll();
	}
	
	@GetMapping("/gettypeById")
	public Flat_type getFlat_type(int id)
	{
		return ftservice.getFlat_type(id);
	}
	
	
	
	
}
