package com.ignite.spring.employee.dao;

import com.ignite.spring.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author Swaminathan.R
 */
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
