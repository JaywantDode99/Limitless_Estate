package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Forget_password_que;

import com.example.demo.repositories.Forget_password_queRepository;

@Service
public class Forget_password_queService {

	@Autowired
	Forget_password_queRepository frepo ;

	public List<Forget_password_que> getAll() {

		return frepo.findAll();
	}

	@Transactional
	public Forget_password_que save(Forget_password_que s)
	{
		return frepo.save(s);	
	}
	
	public Forget_password_que getforgetpwdque(int id) 
	{
		return frepo.findById(id).get();
	}

	
}
