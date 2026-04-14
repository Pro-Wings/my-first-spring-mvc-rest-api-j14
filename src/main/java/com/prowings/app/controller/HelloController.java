package com.prowings.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.app.model.Address;
import com.prowings.app.model.ApiResponse;
import com.prowings.app.model.Student;

import jakarta.validation.Valid;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String greet() {
		return "hello Java Developers!!!";
	}

	@GetMapping(value = "/students/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Student getStudentById(@PathVariable("id") Long id) {

		System.out.println("... calling DB with id : " + id);

		Address address = new Address(411033, "Pune", "India");
		Student fetchedStudent = new Student(111, 10, "Ram", address, true, List.of("Maths", "Physics", "Chemistry"));

		return fetchedStudent;

	}

	@PostMapping(value ="/students", consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> createStudent(@Valid @RequestBody Student student, BindingResult result) {
		System.out.println("----inside createStudent()-----");
		System.out.println("----Received Student -----" + student);
		
		if (result.hasErrors()) {
		    return ResponseEntity.badRequest().body(result.getAllErrors());
		}
		
//		return ResponseEntity.status(201).header("abc", "pqr").body(student);
		ApiResponse<Student> apiRes = new ApiResponse<Student>(200, "Successfully added Student in system!!", student);
		return ResponseEntity.ok(apiRes); 
	}

}
