package com.ignite.spring.employee.service;

import com.ignite.spring.employee.dao.EmployeeRepo;
import com.ignite.spring.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Swaminathan.R
 */
@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(Integer id) {
        return employeeRepo.findById(id).get();
    }

}
