package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import com.example.demo.entities.Projects;
import com.example.demo.entities.ProjectsDummy;
import com.example.demo.entities.SiteVisitDummy;
import com.example.demo.entities.Site_visit;
import com.example.demo.entities.User_details;
import com.example.demo.services.AddressService;
import com.example.demo.services.Builder_firm_regService;
import com.example.demo.services.ProjectsService;
import com.example.demo.services.Site_VisitService;
import com.example.demo.services.User_detailsService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class Site_visitController 
{

	@Autowired
	Site_VisitService svservice ;
	
	@Autowired
	User_detailsService udservice ;
	
	@Autowired
	ProjectsService pservice;

	@GetMapping("/allsitevisit")
	public List<Site_visit> getAll()
	{
		return svservice.getAll();
	}

	@PostMapping("/savesitevisit")
	public Site_visit save(@RequestBody SiteVisitDummy p)
	{	
		System.out.println("SiteVisitDummy - " +p);
		
		Site_visit sv = new Site_visit();
		//sv.setCustomer_login_id(p.getCustomer_login_id());
		//sv.setExecutive_login_id(p.getExecutive_login_id());
		
		return null;
	}
	
	@GetMapping("/getsitevisitrequestbystatus")
	public List<Site_visit>  getSiteVisitRequestByStatus (@RequestParam("id")  int customerLoginid) 
	{
		return svservice.getSiteVisitRequestByStatus(customerLoginid);
	}
	
	@GetMapping("/updatesitevisitrequestbystatus")
	public int updateSiteVisitRequestByStatus (@RequestParam("id")  int siteVisitId) 
	{
		return svservice.updateSiteVisitRequestByStatus(siteVisitId);
	}
	
	@GetMapping("/entryToSiteVisit")
	public Site_visit entryToSiteVisit (@RequestParam("login_id")  int lid,@RequestParam("project_id")  int pid) 
	{
		User_details ud = udservice.getById(lid);
		Projects p = pservice.getById(pid);
		
		Site_visit sv =new Site_visit(ud,p,false);
				
		return svservice.entryToSiteVisit(sv);
	}
	
	
}
