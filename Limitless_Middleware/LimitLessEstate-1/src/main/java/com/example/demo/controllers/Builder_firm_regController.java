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
import com.example.demo.entities.Forget_password_que;
import com.example.demo.entities.Role;
import com.example.demo.entities.Source;
import com.example.demo.entities.User_details;
import com.example.demo.services.AddressService;
import com.example.demo.services.Builder_firm_regService;
import com.example.demo.services.Forget_password_queService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SourceService;
import com.example.demo.services.User_detailsService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class Builder_firm_regController {
	
	@Autowired
	User_detailsService userservice ;
	
	@Autowired
	AddressService aservice;
	
	@Autowired
	Forget_password_queService forgetservice;
	
	@Autowired
	RoleService roleservice ;
	
	@Autowired
	SourceService sourceservice ;
	
	@Autowired
	Builder_firm_regService builderregsservice ;

	@GetMapping("/allBuilderreg")
	public List<Builder_firm_reg> getAll()
	{
		return builderregsservice.getAll();
	}
	
	@GetMapping("/getfirmbyUserid1")
	public Builder_firm_reg  getBuilder_firm_reg1 (@RequestParam("id")   int id) 
	{
		
		System.out.println(id);
		return builderregsservice.getByfirmId(id);
	}
	
	@PostMapping("/savebuilderreg")
	public Builder_firm_reg save(@RequestBody Builder_firm_regDummy a)
	{
		
		System.out.println("Dummy : "+a);
		
		User_details r =new User_details(a.getLogin_id());
		System.out.println("UD Object : "+r);
		System.out.println();
		
		User_details savesrc = userservice.getById(a.getLogin_id());
			
		
		System.out.println("UD save Object :"+savesrc);
				
		Builder_firm_reg  bd = new Builder_firm_reg (a.getFirm_name(),a.getReg_no(),savesrc);
		return builderregsservice.save(bd);		
	}
	
}
