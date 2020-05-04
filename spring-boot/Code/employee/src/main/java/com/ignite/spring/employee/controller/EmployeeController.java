package com.ignite.spring.employee.controller;

import com.ignite.spring.employee.model.Employee;
import com.ignite.spring.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Swaminathan.R
 */
@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok().body(employeeService.findAllEmployee());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
        return ResponseEntity.ok().body(employeeService.findEmployeeById(id));
    }

}
