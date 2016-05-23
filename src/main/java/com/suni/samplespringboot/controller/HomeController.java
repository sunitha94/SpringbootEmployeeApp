package com.suni.samplespringboot.controller;

import com.suni.samplespringboot.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by raju on 23/5/16.
 */
@Controller
public class HomeController {
  Map<Integer, Employee> employeeMap = new HashMap<>();

  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("user", "Sunitha");
    for (int i = 0; i < 10; i++) {
      Employee employee = new Employee();
      employee.setId(i);
      employee.setName("Richard");
      employee.setEmail("richard@gmail.com");
      employee.setGender("Male");
      employeeMap.put(i, employee);
    }
    return "index";
  }

  @RequestMapping(value = "/employees")
  public String employees(Model model) {
    model.addAttribute("employees", employeeMap.values());
    return "employees";
  }
}
