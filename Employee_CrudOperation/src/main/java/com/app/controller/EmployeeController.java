package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;
@RestController

@RequestMapping("/employees")
public class EmployeeController {

	@ Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("In ctr of"+getClass());
	}
	
	@GetMapping
	public List<Employee>getEmpDetails(){
		
		return empService.getAllEmployeeDetails();
		
	}
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee emp) {
		
		return empService.addEmployeeDetails(emp);
		
	}
	
	@DeleteMapping("/{empid}")
	public String deleteEmpDetail( @PathVariable Long empid) {
		
		return empService.deleteEmpDetails(empid);
		
	}
	
	@GetMapping("/{id}")
	public Employee getEmpDetailsById(@PathVariable Long id){
		
		return empService.getEmplDetailsById(id);
		
	}
	
	@PutMapping
	public Employee UpdateEmpDetailsBy(@RequestBody Employee id){
		
		return empService.updateEmplDetails(id);
		
	}
	
	
	
	/*
	 * @GetMapping("/{empId}")
	public Employee getEmpDetails(@PathVariable Long empId) {
		System.out.println("in get emp details " + empId);
		// invoke service layer method to get emp details
		return empService.fetchEmpDetails(empId);
	}

	// http:host:port/employees , method=PUT
	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee detachedEmp) {
		System.out.println("in update emp " + detachedEmp.getId());// not null
		return empService.updateEmpDetails(detachedEmp);
	}
	 */
	 
}
