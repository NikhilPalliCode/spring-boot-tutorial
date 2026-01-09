package com.nutorials.spring_demo.service;

import com.nutorials.spring_demo.entity.Employee;
import com.nutorials.spring_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmp(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmps(){
        return employeeRepository.findAll();
    }

    public String deleteEmp(@PathVariable Integer empId) {
        if (employeeRepository.existsById(empId)) {
            employeeRepository.deleteById(empId);
            return empId + " id deleted successfully.";
        } else {
            return "Sorry couldnt find id";
        }
    }

    public String updateEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Updated successfully.";
    }

}
