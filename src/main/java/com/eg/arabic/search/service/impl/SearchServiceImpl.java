package com.eg.arabic.search.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eg.arabic.search.model.Employee;
import com.eg.arabic.search.repository.EmployeeRepository;
import com.eg.arabic.search.service.SearchService;
import com.eg.arabic.search.utility.ArabicNormalizer;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> searchEmployee(String name) {
		return employeeRepository.findByNameNormalizeContaining(new ArabicNormalizer(name).getOutput());
	}

}
