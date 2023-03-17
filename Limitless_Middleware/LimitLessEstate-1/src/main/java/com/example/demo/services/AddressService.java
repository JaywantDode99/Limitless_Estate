package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entities.Address;
import com.example.demo.entities.Source;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository arepo;

	public List<Address> getAll() {
		return arepo.findAll();

	}

	@Transactional
	public Address save(Address a) {
		return arepo.save(a);
	}

	public Address getAddress(int id) {
		return arepo.findById(id).get();
	}

	public Address getById(int addressid) {

		return arepo.findById(addressid).get();
	}

	public List<Address> findByRegby(String val) {

		return arepo.findByRegby(val);
	}

	public List<Address> findByArea(String area) {

		return arepo.findByArea(area);
	}

}
