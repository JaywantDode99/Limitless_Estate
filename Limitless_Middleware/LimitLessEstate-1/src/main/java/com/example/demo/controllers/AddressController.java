package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.entities.AreaResponse;
import com.example.demo.services.AddressService;

@CrossOrigin (origins = "http://localhost:3000")
@RestController
public class AddressController {
	
	@Autowired
	AddressService addressservice ;

	@GetMapping("/allAddress")
	public List<Address> getAll()
	{
		return addressservice.getAll();
	}
	
	@PostMapping("/saveaddress")
	public Address save(@RequestBody Address a)
	{
		return addressservice.save(a);
	}
	
	public static <T> Predicate<T> distinctByKey(
		    Function<? super T, ?> keyExtractor) {
		  
		    Map<Object, Boolean> seen = new ConcurrentHashMap<>(); 
		    return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null; 
		}
	
	@GetMapping("/getAllArea")
	public List<AreaResponse> getAllArea()
	{
		List<AreaResponse> araeList=new ArrayList<>();
		List<Address> addressList=addressservice.findByRegby("project");
		List<Address> distinctAddressList=addressList.stream() 
				  .filter(distinctByKey(p -> p.getArea())) 
				  .collect(Collectors.toList());
		for (Address address : distinctAddressList) {
			AreaResponse res=new AreaResponse();
			res.setArea(address.getArea());
			araeList.add(res);
		}
		return araeList;
		
		
	}
}
