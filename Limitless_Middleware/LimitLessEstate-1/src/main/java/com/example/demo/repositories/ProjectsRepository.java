package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Address;
import com.example.demo.entities.Projects;
@Repository
public interface ProjectsRepository extends JpaRepository<Projects, Integer> {
	
	@Query("select c from Projects c where project_id= :stateid")
	public List<Projects> getAll(Projects stateid);

	
	@Query("select DISTINCT(c.address_id) from Projects c where project_id= :addressid")
	public Address getAddessId(int addressid);

	@Query("select c from Projects c where c.address_id= :addid")
	public List<Projects> getProByAdd(Address addid);

	@Query("select c from Projects c where project_id= :project_id")
	public List<Projects> getProjectBuyId(int project_id);
	
	@Query("select c from Projects c where address_id in (:ids)")
	public List<Projects> getProjectAddressIds(@Param("ids") List<Address> ids);

	@Query("select c from Projects c where builder_id.login_id.login_id = :login_id")
	public List<Projects> getProjectByBuilderId(int login_id);

	/*@Query("select c from favourite c where project_id = :projects")
	public Optional<Projects> findById(Projects projects);
*/
}



