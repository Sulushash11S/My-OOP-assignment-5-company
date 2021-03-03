package com.company.controllers;

import com.company.entities.Employee;
import com.company.entities.Manager;
import com.company.repositories.interfaces.IMember;

import java.util.List;

public class EmployeeController {
    private final IMember repo;
    public EmployeeController(IMember repo){
        this.repo=repo;
    }
    public String addEmployee(String Emp_name, String status, String level, String department){
        Employee employee = new Employee(Emp_name, status, level, department);
        boolean created= repo.addEmployee(employee);

        return  (created ?  "Employee was added!":"Employee addition was failed!");
    }
    public String getEmployeeByID(int Emp_id){
        Employee employee = repo.getEmployeeByID(Emp_id);

        return (employee == null ? "Employee was not found" : employee.EmpInfo());
    }
    public String getEmployeeByName(String Emp_name){
        Employee employee = repo.getEmployeeByName(Emp_name);

        return (employee == null ? "Employee was not found" : employee.EmpInfo());
    }
    public String positionOfEmployee(String status){
        Employee employee = repo.positionOfEmployee(status);
        return (employee == null ? "Employee was not found" : employee.EmpInfo());
    }
    public String removeEmployeeByLevel(String level) {
        boolean removed = repo.removeEmployeeByLevel(level);

        return ( removed ? "Employee was removed" : "It has trouble");
    }

    public String getAllEmployees(){
        List<Employee> employees= repo.getAllEmployees();

        return employees.toString();
    }
}
