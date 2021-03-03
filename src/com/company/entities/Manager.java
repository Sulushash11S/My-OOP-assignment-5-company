package com.company.entities;

import com.company.repositories.interfaces.INonProg_member;

public class Manager extends Employee implements INonProg_member {
    private int id;
    private String name;
    private String status;
    private String level;
    private String department;
    private int salary;

    public Manager(int Emp_id, String Emp_name, String status, String level, String department) {
        super(Emp_id, Emp_name, status, level, department);
    }

    public Manager(int salary) {
        setSalary(salary);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getLevel() {
        return level;
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = 500000;
    }
    public void setDoingDuration(int day){
        BackendDeveloper.deadline=14;
        FrontendDeveloper.deadline=15;
    }
    public void setBonus(int bonus){
        BackendDeveloper.Bonus=500000;
        FrontendDeveloper.Bonus=300000;
    }
    public void setPenalty(int penalty){
        BackendDeveloper.Penalty=250000;
        FrontendDeveloper.Penalty=150000;
    }
    public String manage(){
        return super.getName() + " manage the department " + super.getDepartment();
    }
    public String position(){
        return super.getName() + " works in IT Company as manager.";
    }
    public String gettingSalary(){
        return  "He gets salary " + getSalary() + "tg per month";
    }

    public String ManagerInfo(){
        System.out.println(manage());
        System.out.println(position());
        System.out.println(gettingSalary());
        return "Information about Manager!";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", level='" + level + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
