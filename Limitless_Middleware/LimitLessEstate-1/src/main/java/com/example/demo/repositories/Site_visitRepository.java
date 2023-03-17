package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Site_visit;
import com.example.demo.entities.User_details;

@Transactional
@Repository
public interface Site_visitRepository extends JpaRepository<Site_visit, Integer> 
{

	@Query("select e from Site_visit e where customer_login_id.role_id.role_id=:customerLoginid and requeststatus = 0 ")
	public List<Site_visit> getSiteVisitRequestByStatus(int customerLoginid);
	
	@Modifying
	@Query("Update Site_visit e set requeststatus = 1 where site_visit_id = :siteVisitId")
	public int updateSiteVisitRequestByStatus(int siteVisitId);


	
	

	


}



