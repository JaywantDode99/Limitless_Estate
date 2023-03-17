package com.example.demo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Flat_category;
import com.example.demo.entities.Role;
import com.example.demo.services.Flat_categoryService;
import com.example.demo.services.RoleService;


@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class Flat_categoryController {
	
	@Autowired
	Flat_categoryService fcservice ;

	
	@GetMapping("/allcategory")
	public List<Flat_category> getAll()
	{
		return fcservice.getAll();
	}
	
	@GetMapping("/getcategoryById")
	public Flat_category getFlat_category(int id)
	{
		return fcservice.getFlat_category(id);
	}
	
	
	
	
}
