package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.entities.BuildingDetails;
import com.example.demo.entities.ProjectDetails;
import com.example.demo.entities.Projects;
import com.example.demo.repositories.Builder_firm_regRepository;
import com.example.demo.repositories.BuildingDetailsRepository;
import com.example.demo.repositories.ProjectsRepository;

@Service
public class BuildingDetailsService {
	
	@Autowired
	BuildingDetailsRepository bdrepo ;
	
	public List<BuildingDetails> getAll()
	{
		return bdrepo.findAll();
	
	}
	
	@Transactional
	public BuildingDetails save(BuildingDetails p)
	{
		return bdrepo.save(p);	
	}
	
	public BuildingDetails getbuilding_id(int building_id)
	{
		return bdrepo.findById(building_id).get();
	}

	public List<BuildingDetails> getBuildingDetails(int building_id)
	{
		return bdrepo.getBuildingDetails(building_id);
	}

	public BuildingDetails getById(int building_id) 
	{
		
		return bdrepo.findById(building_id).get();
	}

	public List<BuildingDetails> getBuildingDetailsBuyId(ProjectDetails project_details_id)
	{
		
		return bdrepo.getBuildingDetailsBuyId(project_details_id);
	}
	

}
