package com.eg.arabic.search.service;

import java.util.List;

import com.eg.arabic.search.model.Employee;

public interface SearchService {
	
	public List<Employee> searchEmployee(String name);

}
