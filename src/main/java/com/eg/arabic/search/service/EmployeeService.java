package com.eg.arabic.search.service;

import java.util.List;

import com.eg.arabic.search.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	List<Employee> saveAll(List<Employee> employees);

}
