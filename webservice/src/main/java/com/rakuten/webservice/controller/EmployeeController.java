package com.rakuten.webservice.controller;

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

import com.rakuten.webservice.entity.Employee;
import com.rakuten.webservice.repo.EmployeeRepository;
import com.rakuten.webservice.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findById(id);
	}

	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.save(emp);
	}

	@PutMapping("/employees/{id}")
	public void updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
		// updatedEmployee will have an existing ID. without id, this will insert a new
		// record
		employeeService.update(id, updatedEmployee);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.delete(id);
	}
}
