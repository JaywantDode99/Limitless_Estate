package com.example.demo.repositories;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.Builder_firm_reg;

@Repository
public interface Builder_firm_regRepository extends JpaRepository<Builder_firm_reg,Integer> {

	
	@Query(value="select * from builder_reg  where login_id= :id",nativeQuery=true)
	public Builder_firm_reg getByfirmId(int id);
	
	
}
