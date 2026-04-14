package com.prowings.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.app.model.Customer;
import com.prowings.app.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}

	@PostMapping(value ="/customers")
	public ResponseEntity<?> createNewCustomer(@RequestBody Customer customer)
	{
		System.out.println("request received to create new Customer!!");
		
		service.addCustomer(customer);
		
		return ResponseEntity.ok("Successfuly Stored customer to DB!!!");
	}

}
