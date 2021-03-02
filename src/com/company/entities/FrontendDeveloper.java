package com.company.entities;

public class FrontendDeveloper extends Employee {
    private int processTime;
    private int salary;
    public static int deadline;
    public static int Bonus;
    public static int Penalty;
    public FrontendDeveloper(int Emp_id,String Emp_name,String status, String level, String department){
        super.setId(Emp_id);
        super.setName(Emp_name);
        super.setStatus(status);
        super.setLevel(level);
        super.setDepartment(department);
    }

}
