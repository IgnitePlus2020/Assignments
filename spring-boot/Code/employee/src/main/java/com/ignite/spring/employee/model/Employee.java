package com.ignite.spring.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Swaminathan.R
 */
@Entity
public class Employee {

    @Id
    @Column(name = "emp_id")
    private Integer empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_email")
    private String empEmail;
    @Column(name = "emp_org")
    private String empOrg;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String empEmail, String empOrg) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empOrg = empOrg;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpOrg() {
        return empOrg;
    }

    public void setEmpOrg(String empOrg) {
        this.empOrg = empOrg;
    }
}
