package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.entities.ProjectDetails;
import com.example.demo.entities.Projects;
import com.example.demo.repositories.Builder_firm_regRepository;
import com.example.demo.repositories.ProjectDetailsRepository;
import com.example.demo.repositories.ProjectsRepository;

@Service
public class ProjectDetailsService {
	@Autowired
	ProjectDetailsRepository pdrepo ;
	
	public List<ProjectDetails> getAll()
	{
		return pdrepo.findAll();
	
	}
	
	@Transactional
	public ProjectDetails save(ProjectDetails p)
	{
		return pdrepo.save(p);	
	}
	
	public ProjectDetails getproject_details_id(int project_details_id)
	{
		return pdrepo.findById(project_details_id).get();
	}
	
	public List<ProjectDetails> getProjectDetails(Projects v)
	{
		return pdrepo.getProjectDetails(v);
	}

	public List<ProjectDetails> getProjectDetailsBuyId(Projects project_id)
	{
		
		return pdrepo.getProjectDetailsBuyId(project_id);
	}
}
