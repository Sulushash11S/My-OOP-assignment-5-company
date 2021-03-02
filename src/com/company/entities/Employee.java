package com.company.entities;

public class Employee {
    private int Emp_id;
    private String Emp_name;
    private String status;
    private String level;
    private String department;

    public  Employee(){

    }

    public Employee(int Emp_id, String Emp_name, String status, String level, String department){
        setId(Emp_id);
        setName(Emp_name);
        setStatus(status);
        setLevel(level);
        setDepartment(department);
    }

    public void setId(int id) {
        this.Emp_id = id;
    }

    public int getId() {
        return Emp_id;
    }

    public void setName(String name) {
        this.Emp_name = name;
    }

    public String getName() {
        return Emp_name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_id=" + Emp_id +
                ", Emp_name='" + Emp_name + '\'' +
                ", status='" + status + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
