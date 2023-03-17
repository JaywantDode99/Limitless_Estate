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
import com.example.demo.entities.BuildingDetails;
import com.example.demo.entities.BuildingDetailsDummy;
import com.example.demo.entities.Flat_category;
import com.example.demo.entities.Flat_type;
import com.example.demo.entities.ProjectDetails;
import com.example.demo.entities.Projects;
import com.example.demo.entities.ProjectsDummy;
import com.example.demo.entities.User_details;
import com.example.demo.services.AddressService;
import com.example.demo.services.Builder_firm_regService;
import com.example.demo.services.BuildingDetailsService;
import com.example.demo.services.Flat_categoryService;
import com.example.demo.services.ProjectDetailsService;
import com.example.demo.services.ProjectsService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class BuildingDetailsController {

	@Autowired
	Flat_categoryService fcservice;

	
	@Autowired
	ProjectDetailsService pdservice;
	
	@Autowired
	 BuildingDetailsService bdservice;
	
	@GetMapping("/allbuildings")
	public List<BuildingDetails> getAll()
	{
		return bdservice.getAll();
	}

	@PostMapping("/savebuildings")
	public BuildingDetails save(@RequestBody BuildingDetailsDummy b)
	{
		System.out.println("ProjectDetailsDummy - " +b);
		
		Flat_category ft = new Flat_category(b.getCategory_id());
		Flat_category saveft = fcservice.getFlat_category(ft.getCategory_id());
		
		System.out.println("Flat_category - " +saveft);
		
		ProjectDetails pid = new ProjectDetails(b.getProject_details_id());
		ProjectDetails savepid = pdservice.getproject_details_id(pid.getProject_details_id());
		
		System.out.println("ProjectDetails - " +savepid);
		
		BuildingDetails psave = new BuildingDetails(saveft, b.getTotal_flats(), b.getPrice() ,savepid);
		BuildingDetails pd = bdservice.save(psave);
		
		System.out.println("BuildingDetails - " +pd);
		
		return pd;
	}
	
	@GetMapping("/BuildingDetails")
	public List<BuildingDetails> getBuildingDetails(@RequestParam("building_id") int building_id)
	{
		//BuildingDetails b =bdservice.getById(building_id);
		return bdservice.getBuildingDetails(building_id);
	}
	
	@GetMapping("/getBuildingDetailsBuyId")
	public List<BuildingDetails> getBuildingDetailsBuyId(@RequestParam("project_details_id") ProjectDetails project_details_id)
	{
		
		return bdservice.getBuildingDetailsBuyId(project_details_id);
	}
	
	
}
