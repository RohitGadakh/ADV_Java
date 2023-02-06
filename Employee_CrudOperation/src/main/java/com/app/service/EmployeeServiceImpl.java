package com.app.service;
import com.app.exp.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getAllEmployeeDetails() {
		
		return empRepo.findAll();
	}

	@Override
	public Employee addEmployeeDetails( Employee emps) {
		
		return empRepo.save(emps);
	}

	@Override
	public String deleteEmpDetails(long empId) {
		if(empRepo.existsById(empId)) {
			
			empRepo.deleteById(empId);
			return "deleted success..!!!";
		}
		return "Invalid details...";
	}

	@Override
	public Employee getEmplDetailsById(long empId) {
		
		return empRepo.findById(empId).orElseThrow();
	}

	@Override
	public Employee updateEmplDetails(Employee updateEmp){
		if(empRepo.existsById(updateEmp.getId())) {
			
			return empRepo.save(updateEmp);
		}
		throw new ResourseNotFoundExc("Invalid Id");
		
		
		
	}

}
