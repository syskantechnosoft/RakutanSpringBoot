package com.rakuten.webservice.service;

import java.util.List;

import com.rakuten.webservice.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int id);

	void save(Employee emp);

	void update(int id, Employee emp);

	void delete(int id);
}
