package com.employee.employeeapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {
	
	

}
