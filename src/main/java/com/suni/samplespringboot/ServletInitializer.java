package com.suni.samplespringboot;

import com.suni.samplespringboot.model.Employee;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import java.util.HashMap;
import java.util.Map;

public class ServletInitializer extends SpringBootServletInitializer {
  public static Map<Integer, Employee> employeeMap = new HashMap<>();

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    for (int i = 0; i < 10; i++) {
      Employee employee = new Employee();
      employee.setId(i);
      employee.setName("Richard");
      employee.setEmail("richard@gmail.com");
      employee.setGender("Male");
      employeeMap.put(i, employee);
    }
    return application.sources(SampleSpringBootApplication.class);
  }

}
