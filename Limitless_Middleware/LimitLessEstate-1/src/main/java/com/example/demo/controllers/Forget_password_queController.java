package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Forget_password_que;

import com.example.demo.services.Forget_password_queService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class Forget_password_queController {
	
	@Autowired
	Forget_password_queService forgetservice;
	
	
	@GetMapping("/allQue")
	public List<Forget_password_que> getAll()
	{
		return forgetservice.getAll();
	}
	
	
}
