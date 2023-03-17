package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Address;
import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.entities.Projects;
import com.example.demo.repositories.Builder_firm_regRepository;
import com.example.demo.repositories.ProjectsRepository;

@Service
public class ProjectsService {
	@Autowired
	ProjectsRepository prepo ;
	
	public List<Projects> getAll()
	{
		return prepo.findAll();
	
	}
	
	@Transactional
	public Projects save(Projects p)
	{
		return prepo.save(p);	
	}
	
	public Projects getProject_id(int project_id)
	{
		return prepo.findById(project_id).get();
	}
	
	public Projects getBuId(int builder_id)
	{
		return prepo.findById(builder_id).get();
	}
	
	public Projects getById(int cityid)
	{
		return prepo.findById(cityid).get();
	}

	public List<Projects> getByAddress(Projects s) {
		// TODO Auto-generated method stub
		return prepo.getAll(s);
	}

	public Address getAddessId(int addressid) {

		return prepo.getAddessId(addressid);
	}

	public List<Projects> getProByAdd(Address addid) {
		
		System.out.println( addid);
		return prepo.getProByAdd(addid);
	}

	public List<Projects> getProjectBuyId(int project_id) 
	{
		
		return prepo.getProjectBuyId(project_id);
	}
	
	public List<Projects> getProjectByAddressIds(List<Address> ids) 
	{
		return prepo.getProjectAddressIds(ids);
	}
/*
	public Projects getProject_id(Projects project_id) {
		// TODO Auto-generated method stub
		return prepo.findById(project_id);
	}
*/

	public List<Projects> getProjectByBuilderId(int login_id) 
	{
		
		return prepo.getProjectByBuilderId(login_id);
	}
	
	
}
