package com.rakuten.starter;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rakuten.starter.entity.Employee;

public class CRUDDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating Persistence Manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpademo");
		EntityManager em = emf.createEntityManager();

		// Creating Employee object
		Employee emp = new Employee();
		emp.setId(102);
		emp.setName("ABC");
		emp.setEmail("abc@gmail.com");

		// beginning the transaction
		em.getTransaction().begin();
		// save or persist the obj (Insert operation)
		em.persist(emp);
		// Commiting the DB operation (Changes will be saved permanently)
		em.getTransaction().commit();
		
		
		
		//Read data from table (Read operation)
//		Query query = ;
		
		List<Employee> employees = em.createQuery("select e from Employee e").getResultList();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		if (em != null)
			em.close();

	}

}
