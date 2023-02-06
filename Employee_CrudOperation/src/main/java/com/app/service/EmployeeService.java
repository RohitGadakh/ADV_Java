package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {

	 List<Employee>getAllEmployeeDetails();
	 Employee addEmployeeDetails(Employee emps);
	 String deleteEmpDetails(long empId);
	 //update
	 Employee getEmplDetailsById(long empId);
	 Employee updateEmplDetails(Employee updateEmp);
}
