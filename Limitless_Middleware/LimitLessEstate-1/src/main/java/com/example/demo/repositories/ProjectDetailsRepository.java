package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ProjectDetails;
import com.example.demo.entities.Projects;

@Repository
public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Integer> 
{
	@Query("select d from ProjectDetails d where project_id=:d")
	public List<ProjectDetails> getProjectDetails(Projects d);
	

	@Query("select d from ProjectDetails d where  project_id=:project_id")
	public List<ProjectDetails> getProjectDetailsBuyId(Projects project_id);
	
}
