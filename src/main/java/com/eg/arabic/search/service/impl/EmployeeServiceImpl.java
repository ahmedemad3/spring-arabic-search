package com.eg.arabic.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eg.arabic.search.model.Employee;
import com.eg.arabic.search.repository.EmployeeRepository;
import com.eg.arabic.search.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> saveAll(List<Employee> employees) {
		return employeeRepository.saveAll(employees);
	}
}
