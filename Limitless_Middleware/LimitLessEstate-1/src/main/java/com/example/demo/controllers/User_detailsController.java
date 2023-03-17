package com.example.demo.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.*;
import com.example.demo.services.AddressService;
import com.example.demo.services.Forget_password_queService;
import com.example.demo.services.RoleService;
import com.example.demo.services.SourceService;
import com.example.demo.services.User_detailsService;


@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class User_detailsController {
	
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
	
//	@Autowired
//	SaltValue saltvalue;
	
	@PostMapping ("/checkLogin")
	public User_details checkLogin (@RequestBody User_details ud )
		{
			System.out.println(ud.getEmail_id());
			System.out.println(ud.getPassword());
			return userservice.checkLogin(ud.getEmail_id(), ud.getPassword()) ;
		}
	
	
	@GetMapping("/allUser")
	public List<User_details> getAll()
	{
		return userservice.getAll();
	}
	
	@GetMapping("/getbyUserid")
	public User_details  getUser_details (@RequestParam("id")   int id) 
	{
		return userservice.getById(id);
	}
	
	@GetMapping("/getQuestions")
	public User_details getQuestionByUserName(@RequestParam("username") String name)
	{
		return userservice.getQuestionByUserName(name);
	}
	 			
	@PutMapping("/resetPassword")
	public int resetPassword(@RequestParam("userid") int id,@RequestParam("password") String password)
	{
		return userservice.resetPassword( id,password);
	}
	
	@GetMapping("/getbystatus")
	public List<User_details>  getUser_detailsByStatus (@RequestParam("id")  int id) 
	{
		return userservice.getUser_detailsByStatus(id);
	}
	
	@GetMapping("/updatebystatus")
	public int updateUser_detailsByStatus (@RequestParam("id")  int id) 
	{
		return userservice.updateUser_detailsByStatus(id);
	}
	
	@PostMapping("/saveuser")
	public User_details save(@RequestBody CustomerReg a)
	{
		System.out.println(a);
		
		a.setRegBy("customer");
		
		Role r = roleservice.getRole(5);
		
		System.out.println(r);
		
		Source sd = new Source(a.getSource_id());
		Source savesrc = sourceservice.getSource(a.getSource_id());
		
		System.out.println(savesrc);

		Address adr = new Address(a.getHouse_no(),a.getBuilding_name(),a.getArea(),a.getCity(),a.getPincode(),a.getRegBy());
		Address saveadr=aservice.save(adr);
	
		System.out.println(saveadr);
		
		Forget_password_que fpq = new Forget_password_que(a.getforget_pwd_que_id());
		Forget_password_que f = forgetservice.getforgetpwdque(fpq.getForget_pwd_que_id());
		
		
		System.out.println(f);
		
	//	String encrypted = PassBasedEnc.generateSecurePassword(a.getPassword(), saltvalue.getSalt());
		
		User_details ud = new User_details(a.getFirst_name(),a.getLast_name(),a.getMobile_no(),
				a.getEmail_id(),a.getPassword(), r,true,savesrc,f,a.getAnswer(),saveadr);
		
		return userservice.save(ud);
	}
	
	
	@PostMapping("/savealluser")
	public User_details save(@RequestBody AllRegistration a)
	{
		
		System.out.println(a);
						
		Role r = roleservice.getRole(a.getRole_id());		
		
		if(r.getRole_name().equalsIgnoreCase("Executive")) 
		{
			System.out.println("executive");
			a.setRegBy("executive");
		}
		else {
			a.setRegBy("marketing");
		}
		
		System.out.println(r);
		
		Address adr = new Address();
		adr.setArea(a.getArea());
		adr.setBuilding_name(a.getBuilding_name());
		adr.setCity(a.getCity());
		adr.setHouse_no(a.getHouse_no());
		adr.setPincode(a.getPincode());
		adr.setRegBy(a.getRegBy());
		Address saveadr=aservice.save(adr);
		
		System.out.println("klsllsl"+saveadr.getRegBy());
		
		Forget_password_que fpq = new Forget_password_que(a.getforget_pwd_que_id());
		Forget_password_que f = forgetservice.getforgetpwdque(fpq.getForget_pwd_que_id());
		
		System.out.println(f);
		
		User_details ud = new User_details(a.getFirst_name(),a.getLast_name(),a.getMobile_no(),
				a.getEmail_id(),a.getPassword(), r,true,null,f,a.getAnswer(),saveadr);
		
		return userservice.save(ud);
	}
	
	@PostMapping("/savebuilder")
	public User_details save(@RequestBody BuilderRegistration a)
	{		
		System.out.println("BReg dummy : "+a);
		
		a.setRegBy("builder");
		
		Role r = roleservice.getRole(2);
		
		System.out.println(r);
		
		Address adr = new Address(a.getHouse_no(),a.getBuilding_name(),a.getArea(),a.getCity(),a.getPincode(),a.getRegBy());
		Address saveadr=aservice.save(adr);
		
		System.out.println(saveadr);
		
		Forget_password_que fpq = new Forget_password_que(a.getforget_pwd_que_id());
		Forget_password_que f = forgetservice.getforgetpwdque(fpq.getForget_pwd_que_id());
		
		System.out.println(f);
		
		User_details ud = new User_details(a.getFirst_name(),a.getLast_name(),a.getMobile_no(),
				a.getEmail_id(),a.getPassword(), r,false,null,f,a.getAnswer(),saveadr);
		System.out.println("Hello"+ud);
		
		User_details ud1 =userservice.save(ud);
		System.out.println(ud1);
		return ud1;
	}		
}
		
		

