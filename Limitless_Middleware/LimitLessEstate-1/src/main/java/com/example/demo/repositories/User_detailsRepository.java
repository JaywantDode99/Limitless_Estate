package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Role;
import com.example.demo.entities.User_details;

@Transactional
@Repository
public interface User_detailsRepository extends JpaRepository<User_details, Integer> 
{
	
	@Query("select e from User_details e where email_id = :email and password=:pwd")
	public Optional<User_details> checkLogin (String email , String pwd);
	
	@Query("select e from User_details e where login_id = :id")
	public User_details  getUser_details (User_details id) ;
	
	@Query("select e from User_details e where role_id.role_id=:id and status = 0 ")
	public List<User_details> getUser_detailsByStatus(int id);
	
	@Modifying
	@Query("Update User_details e set status = 1 where login_id = :id")
	public int updateUser_detailsByStatus(int id);
	
	@Query("select e from User_details e where email_id = :name")
	public User_details getQuestionByUserName(String name);
	
	@Modifying
	@Query("Update User_details e set password = :password where login_id = :id")
	public int resetPassword(int id, String password);
	
	
}
