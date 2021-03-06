package com.suni.samplespringboot.controller;

import com.suni.samplespringboot.SampleSpringBootApplication;
import com.suni.samplespringboot.ServletInitializer;
import com.suni.samplespringboot.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by raju on 23/5/16.
 */
@Controller
public class HomeController {
  Map<Integer, Employee> employeeMap = ServletInitializer.employeeMap;

  @RequestMapping(value = "/")
  public String home(Model model) {
    model.addAttribute("user", "Sunitha");
    return "index";
  }

  @RequestMapping(value = "/employees")
  public String employees(Model model) {
    model.addAttribute("employees", employeeMap.values());
    return "employees";
  }

  @RequestMapping(value = "/employees/{empId}")
  public String editEmployee(@PathVariable(value = "empId") int empId, Model model) {
    model.addAttribute("employee", employeeMap.get(empId));
    return "editEmployee";
  }

  @RequestMapping(value = "/employees/update")
  public String updateEmployees(Employee employee, Model model) {
    employeeMap.put(employee.getId(), employee);
    return "redirect:/employees";
  }

  @RequestMapping(value = "/employees/{empId}/delete")
  public String deleteEmployees(@PathVariable(value = "empId") Integer empId, Model model) {
    employeeMap.remove(empId);
    model.addAttribute("employees", employeeMap.values());
    model.addAttribute("message", "successfully employee deleted");
    return "employees";
  }

  @RequestMapping(value = "/addEmployee")
  public String employeeForm(Model model){
    model.addAttribute("employee",new Employee());
    return "addEmployee";
  }

  @RequestMapping(value = "/employees/add")
  public String addEmployees(Employee employee, Model model) {
System.out.println(employee);
    employee.setId(employeeMap.size()+1);
    employeeMap.put(employeeMap.size()+1,employee);
   System.out.println("size"+employeeMap.size());
    return "redirect:/employees";
  }
}
