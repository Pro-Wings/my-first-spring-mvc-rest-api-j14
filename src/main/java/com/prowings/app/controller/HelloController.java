package com.prowings.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.app.model.Address;
import com.prowings.app.model.Student;

@RestController
public class HelloController {
	
	
	@GetMapping("/hello")
	public String greet()
	{
		return "hello Java Developers!!!";
	}
	
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable("id") Long id)
	{
		
		System.out.println("... calling DB with id : "+id);
		
		Address address = new Address(411033, "Pune", "India");
		Student fetchedStudent = new Student(111, 10, "Ram", address, true, List.of("Maths","Physics","Chemistry"));
		
		return fetchedStudent; 
		
	}
	
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student)
	{
		System.out.println("----inside createStudent()-----");
		System.out.println("----Received Student -----" +student);
	}

}
