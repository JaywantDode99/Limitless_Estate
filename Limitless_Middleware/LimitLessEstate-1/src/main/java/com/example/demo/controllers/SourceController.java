package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Source;
import com.example.demo.services.SourceService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class SourceController {
	
	@Autowired
	SourceService sourceservice ;
	
	@GetMapping("/allSource")
	public List<Source> getAll()
	{
		return sourceservice.getAll();
	}

}
