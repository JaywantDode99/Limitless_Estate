package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Address;
import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.entities.Projects;
import com.example.demo.entities.Site_visit;
import com.example.demo.entities.User_details;
import com.example.demo.repositories.Builder_firm_regRepository;
import com.example.demo.repositories.ProjectsRepository;
import com.example.demo.repositories.Site_visitRepository;

@Service
public class Site_VisitService {
	@Autowired
	Site_visitRepository svrepo ;
	
	public List<Site_visit> getAll()
	{
		return svrepo.findAll();	
	}
	
	@Transactional
	public Site_visit save(Site_visit p)
	{
		return svrepo.save(p);	
	}
	
	public Site_visit getBySite_visit_id(int site_visit_id)
	{
		return svrepo.findById(site_visit_id).get();
	}

	public List<Site_visit> getSiteVisitRequestByStatus(int id) 
	{
		
		return svrepo.getSiteVisitRequestByStatus(id);
	}

	

	public int updateSiteVisitRequestByStatus(int id) 
	{
		
		return svrepo.updateSiteVisitRequestByStatus(id);
	}

	
	public Site_visit entryToSiteVisit(Site_visit sv) {
		// TODO Auto-generated method stub
		return svrepo.save(sv);
	}
	
	
	
	
}
