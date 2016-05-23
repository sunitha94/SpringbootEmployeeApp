package com.suni.samplespringboot;

import com.suni.samplespringboot.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SampleSpringBootApplication {
	public static Map<Integer, Employee> employeeMap=new HashMap<>();
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Employee employee = new Employee();
			employee.setId(i);
			employee.setName("Richard");
			employee.setEmail("richard@gmail.com");
			employee.setGender("Male");
			employeeMap.put(i, employee);
		}
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}
}
