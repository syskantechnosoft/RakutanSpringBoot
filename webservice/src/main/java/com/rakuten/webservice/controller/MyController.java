package com.rakuten.webservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.webservice.entity.Employee;

@RestController
public class MyController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to SpringBoot Web Service";
	}

	@RequestMapping("/hi")
	public String hello() {
		return "HelloWorld!!!";
	}

	@RequestMapping("/employees")
	public List<Employee> getEmployees(){
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(100, "ABC", "ABC@GMAIL.COM"));
		employeesList.add(new Employee(101, "XYZ", "XYZ@GMAIL.COM"));
		return employeesList;
	}
}
