package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.FavResponse;
import com.example.demo.entities.Favourite;
import com.example.demo.entities.Favouritedummy;
import com.example.demo.entities.Projects;
import com.example.demo.entities.User_details;
import com.example.demo.services.FavouriteService;
import com.example.demo.services.ProjectsService;
import com.example.demo.services.User_detailsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FavouriteController {

	@Autowired
	FavouriteService favouriteservice;

	@Autowired
	User_detailsService userservice;

	@Autowired
	ProjectsService pservice;

	@GetMapping("/allFavourite")
	public List<Favourite> getAll() {
		return favouriteservice.getAll();
	}

	@PostMapping("/addtofavourite")
	public FavResponse addtofavourite(@RequestBody Favouritedummy a)
	{
		
		System.out.println("Favouritedummy : "+ a);
		
		FavResponse res = new FavResponse();
		User_details userDetails = userservice.getById(a.getLogin_id());
		Projects proj = pservice.getProject_id(a.getProject_id());
		Favourite favResp = favouriteservice.findByLoginId(userDetails, proj);
		if (favResp == null) {
			User_details lid = userservice.getById(a.getLogin_id());

			Projects pid = pservice.getProject_id(a.getProject_id());
			Favourite f = new Favourite(lid, pid);
			favouriteservice.save(f);
			res.setMessage("Project added to Favourite");
			res.setErrorCode(1);
			res.setStatus("200");
		} else {
			res.setMessage("Project already added to Favourite");
			res.setErrorCode(0);
			res.setStatus("500");
		}
		return res;

	}

	@GetMapping("/getProjectByLoginId")
	public List<Favourite> getDetailsById(@RequestParam("login_id") User_details login_id) {
		System.out.println("Login id :- " + login_id);

		return favouriteservice.getDetailsById(login_id);
	}

	/*@GetMapping("/getFavoriteProject")
	public List<Projects> getFavoriteProject(@RequestParam("loginId") int loginId) {
		User_details userDetails = userservice.getById(loginId);
		List<Projects> listProjects = new ArrayList<>();
		List<Favourite> favResList = favouriteservice.getDetailsById(userDetails);
		
		for (Favourite favourite : favResList) {
			System.out.println(favourite);
			
			//Projects proj = pservice.getProject_id(favourite.getProject_id());
		//	listProjects.add(proj);			
		}
		
		return listProjects;
	}*/
	
	
	@GetMapping("/getFavoriteProjects")
	public List<Projects> getFavoriteProjects(@RequestParam("loginId") int id) {
		User_details userDetails = userservice.getById(id);
		
	
		
		
		
		return favouriteservice.getFavoriteProjects(userDetails);
	}
	
	
	

}
