package com.rakuten.myfirstboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rakuten.myfirstboot.entity.Employee;

@SpringBootApplication
public class MyfirstbootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MyfirstbootApplication.class, args);
	}
	
	@Bean
	public Employee getEmployee() {
		return new Employee(100,"Test");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getEmployee());
	}

}
