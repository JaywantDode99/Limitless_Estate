package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.BuildingDetails;
import com.example.demo.entities.ProjectDetails;


@Repository
public interface BuildingDetailsRepository extends JpaRepository<BuildingDetails, Integer> 
{

	//List<BuildingDetails> getProjectDetails(ProjectDetails v);
	
	@Query("select d from BuildingDetails d where building_id=:building_id")
	public List<BuildingDetails> getBuildingDetails(int building_id );
	

	@Query("select d from BuildingDetails d where project_details_id=:project_details_id")
	public List<BuildingDetails> getBuildingDetailsBuyId(ProjectDetails project_details_id);
	

}
