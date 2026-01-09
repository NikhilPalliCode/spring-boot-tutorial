package com.nutorials.spring_demo.repository;

import com.nutorials.spring_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
