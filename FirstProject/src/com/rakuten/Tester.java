package com.rakuten;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//traditional way of creating objects
		Employee emp1 = new Employee();
		System.out.println(emp1);
		
		Employee emp = new Employee(105, "Test");
		System.out.println(emp);
		
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Spring framework IoC method to create object
		//loosely coupled java application
		Employee emp2 = (Employee) factory.getBean("employeeBean");
		System.out.println(emp2);
	}

}
