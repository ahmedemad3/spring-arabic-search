package com.eg.arabic.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eg.arabic.search.model.Employee;
import com.eg.arabic.search.service.EmployeeService;
import com.eg.arabic.search.service.SearchService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
    private SearchService searchService;
	
	@Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
    
    
    @PostMapping("/save/all")
    public ResponseEntity<List<Employee>> addEmployees(@RequestBody List<Employee> employees) {
        List<Employee> savedEmployees = employeeService.saveAll(employees);
        return ResponseEntity.ok().body(savedEmployees);
    }
    
    @GetMapping("/search")
    public List<Employee> search(@RequestParam("q") String query) {
        return searchService.searchEmployee(query);
    }

}
