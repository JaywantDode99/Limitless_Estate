package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.entities.Builder_firm_regDummy;
import com.example.demo.entities.Flat_type;
import com.example.demo.entities.ProjectDetails;
import com.example.demo.entities.ProjectDetailsDummy;
import com.example.demo.entities.Projects;
import com.example.demo.entities.ProjectsDummy;
import com.example.demo.entities.Source;
import com.example.demo.entities.User_details;
import com.example.demo.services.AddressService;
import com.example.demo.services.Builder_firm_regService;
import com.example.demo.services.Flat_typeService;
import com.example.demo.services.ProjectDetailsService;
import com.example.demo.services.ProjectsService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class ProjectDetailsController {
	
	@Autowired
	ProjectDetailsService pdservice;

	@Autowired
	Flat_typeService ftservice;
	
	@Autowired
	ProjectsService pservice;
	
	@GetMapping("/allProjectDetails")
	public List<ProjectDetails> getAll()
	{
		return pdservice.getAll();
	}
	
	@PostMapping("/saveprojectdetails")
	public ProjectDetails save(@RequestBody ProjectDetailsDummy p)
	{
		System.out.println("ProjectDetailsDummy - " +p);
		
		Flat_type ft = new Flat_type(p.getType_id());
		Flat_type saveft = ftservice.getFlat_type(ft.getType_id());
		
		System.out.println("Flat_type - " +saveft);
		
		Projects pid = new Projects(p.getProject_id());
		Projects savepid = pservice.getProject_id(pid.getProject_id());
		
		System.out.println("Projects - " +savepid);
		
		ProjectDetails psave = new ProjectDetails(p.getBuilding_name(),p.getTotal_flats(),saveft,savepid);
		ProjectDetails pd = pdservice.save(psave);
		
		System.out.println("ProjectDetails - " +pd);
		
		return pd;
	}
	
//	@GetMapping("/getprojectdetails")
//	public List<ProjectDetails> getProjectDetails(@RequestParam("project_id") int project_id)
//	{
//	Projects b =pservice.getById(project_id);
//		return pdservice.getProjectDetails(b);
//	}

	
	@GetMapping("/getProjectDetailsBuyId")
	public List<ProjectDetails> getProjectDetailsBuyId(@RequestParam("project_id") Projects project_id)
	{
		
		return pdservice.getProjectDetailsBuyId(project_id);
	}	
}
