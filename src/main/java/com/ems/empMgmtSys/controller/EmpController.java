package com.ems.empMgmtSys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.empMgmtSys.dao.EmpRepository;
import com.ems.empMgmtSys.entities.Employee;

@RestController
@RequestMapping("/emp")
public class EmpController 
{
	
	@GetMapping("/emp/hello")
	public String sayHello()
	{
		return "HELLO";
	}
	
	
	@Autowired
	private EmpRepository empRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmp()
	{
		return empRepo.findAll();
	}
}
