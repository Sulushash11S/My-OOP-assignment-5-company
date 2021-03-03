package com.company.repositories.interfaces;

import com.company.entities.Employee;
import com.company.entities.Manager;

import java.util.List;

public interface IMember {
        boolean addEmployee(Employee employee);
        Employee getEmployeeByID(int Emp_id);
        boolean removeEmployeeByLevel(String level);
        Employee getEmployeeByName(String Emp_name);
        List<Employee> getAllEmployees();
    Employee positionOfEmployee(String status);
}
