package com.nutorials.spring_demo.controllers;

import com.nutorials.spring_demo.entity.Employee;
import com.nutorials.spring_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @PostMapping("/")
    public Employee saveEmp(@RequestBody Employee employee){
        return employeeService.saveEmp(employee);
    }

    @GetMapping("/fetch-all")
    public List<Employee> getAllEmps(){
        return employeeService.getAllEmps();
    }

    @DeleteMapping("/{empId}")
    public String deleteEmp(@PathVariable Integer empId){
        return employeeService.deleteEmp(empId);

    }

    @PutMapping("/")
    public String updateEmp(@RequestBody Employee employee){
        return employeeService.updateEmp(employee);
    }

}
