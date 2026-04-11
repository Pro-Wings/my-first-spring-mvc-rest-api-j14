package com.prowings.app.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"id",
	"rollNumber",
	"name",
	"address",
	"isPresent",
	"subjects"
})
public class Student {
	
	@JsonProperty("id")
	private long id;
	@JsonProperty("rollNumber")
	private int rollNumber;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private Address address;
	@JsonProperty("isPresent")
	private boolean isPresent;
	@JsonProperty("subjects")
	private List<String> subjects;

	public Student() {
		super();
	}

	public Student(long id, int rollNumber, String name, Address address, boolean isPresent, List<String> subjects) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
		this.isPresent = isPresent;
		this.subjects = subjects;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	
}
