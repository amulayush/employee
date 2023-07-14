package com.ems.empMgmtSys.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	
	
	@Column(name = "first_name")
	private String firstName;
	
	
	@Column(name = "last_name")
	private String lastName;
	
	
	@Column(name = "email")
	private String email;
	

	public Employee(String firstName, String lastName, String email, long empId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", empId=" + empId
				+ "]";
	}
	
	public Employee(){}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}
	
	

}
