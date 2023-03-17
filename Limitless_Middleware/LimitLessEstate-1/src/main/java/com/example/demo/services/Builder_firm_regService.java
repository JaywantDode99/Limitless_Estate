package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Address;
import com.example.demo.entities.Builder_firm_reg;
import com.example.demo.repositories.AddressRepository;
import com.example.demo.repositories.Builder_firm_regRepository;

@Service
public class Builder_firm_regService {
	@Autowired
	Builder_firm_regRepository brepo ;
	
	public List<Builder_firm_reg> getAll()
	{
		return brepo.findAll();
	
	}
	
	@Transactional
	public Builder_firm_reg save(Builder_firm_reg a)
	{
		return brepo.save(a);	
	}
	
	public Builder_firm_reg getBuId(int builder_id)
	{
		return brepo.findById(builder_id).get();
	}

	public Builder_firm_reg getByfirmId(int id)
	{
		
		System.out.println(id);
		
		return brepo.getByfirmId(id);
	}


}
