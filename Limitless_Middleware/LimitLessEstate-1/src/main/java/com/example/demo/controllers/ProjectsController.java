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
import com.example.demo.entities.User_details;
import com.example.demo.services.AddressService;
import com.example.demo.services.Builder_firm_regService;
import com.example.demo.services.ProjectsService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class ProjectsController 
{

	@Autowired
	Builder_firm_regService builderregsservice ;
	
	@Autowired
	AddressService aservice;
	
	@Autowired
	ProjectsService pservice;
	
	@GetMapping("/allProjects")
	public List<Projects> getAll()
	{
		return pservice.getAll();
	}

	@PostMapping("/saveprojects")
	public Projects save(@RequestBody ProjectsDummy p)
	{
		
		System.out.println("ProjectsDummy - " +p);
		
		p.setRegBy("project");
		
		Builder_firm_reg r =new Builder_firm_reg(p.getBuilder_id());	
		Builder_firm_reg savesrc = builderregsservice.getBuId(r.getBuilder_id());
		
		
		Address adr = new Address(p.getHouse_no(),p.getBuilding_name(),p.getArea(),p.getCity(),p.getPincode(),p.getRegBy());
		Address saveadr= aservice.save(adr);
		
		System.out.println("DDRESS : " + saveadr);

		Projects  bd = new Projects (p.getProject_name(),p.getContact_no(),
				p.getRera_no(),p.getTotal_buildings(),p.getTotal_flats(),p.getStart_date(),p.getEnd_date(),saveadr,savesrc);
		return pservice.save(bd);
	}
	
	
	@GetMapping("/getallProjects")
	public List<Projects> getAll(@RequestParam("address_id") int addressid)
	{
		/*System.out.println(addressid);
		System.out.println();
		Projects s= aservice.getById(addressid);
		System.out.println(s);
		return pservice.getByAddress(s);*/
		
		Address addid = pservice.getAddessId(addressid) ;
		
		System.out.println("address id"+addid);
				
		return pservice.getProByAdd(addid);
		//return null;
	}
	
	@GetMapping("/getProjectBuyId")
	public List<Projects> getBuildingDetails(@RequestParam("project_id") int project_id)
	{
		System.out.println("Projct id :- "+project_id);
		
		return pservice.getProjectBuyId(project_id);
	}
	
	@GetMapping("/getProjectByBuilderId")
	public List<Projects> getProjectByBuilderId(@RequestParam("login_id") int login_id)
	{
		System.out.println("Builder id :- "+login_id);
		
		return pservice.getProjectByBuilderId(login_id);
	}
	
	@GetMapping("/getAllProjectByArea")
	public List<Projects> getAllProjectByArea(String area)
	{
		List<Address> addressList=aservice.findByArea(area);
//		List<Integer> addressIds=addressList.stream().map(e->e.getAddress_id()).collect(Collectors.toList());
		List<Projects> projectList=pservice.getProjectByAddressIds(addressList);
		return projectList;		
	}
}
