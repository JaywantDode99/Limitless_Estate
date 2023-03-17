package com.example.demo.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Role;
import com.example.demo.services.RoleService;


@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class RoleController {
	
	@Autowired
	RoleService roleservice ;

	
	@GetMapping("/allRoles")
	public List<Role> getAll()
	{
		return roleservice.getAll();
	}
	
	@GetMapping("/getRoleById")
	public Role getRole(int id)
	{
		return roleservice.getRole(id);
	}
	
	
	
	
}
