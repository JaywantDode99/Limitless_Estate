package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Favourite;
import com.example.demo.entities.Projects;
import com.example.demo.entities.User_details;


@Repository
public interface FavouriteRepository extends JpaRepository<Favourite, Integer> {

	@Query("select c from Favourite c where login_id= :login_id")
	List<Favourite> getDetailsById(User_details login_id);
	
	@Query("select c from Favourite c where login_id= :loginId and project_id= :projectId")
	Favourite getByLoginId(User_details loginId,Projects projectId);
	
	
	@Query("select c from Favourite c where login_id= :id ")
	List<Projects> getFavoriteProjects(User_details id);

}
