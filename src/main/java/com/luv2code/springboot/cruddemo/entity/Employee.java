package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code")
	private int code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="location")
	private String location;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	private String dob;

	public Employee(String name, String location, String email, String dob) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}

	
	
	public Employee() 
	{
	
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", location=" + location + ", email=" + email + ", dob="
				+ dob + "]";
	}
	
	
}











