package com.rakuten.webservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.webservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
