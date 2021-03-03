package com.company.entities;

import com.company.repositories.interfaces.IProg_member;

public class BackendDeveloper extends Employee implements IProg_member {
    private int processTime;
    private int salary;
    public static int deadline;
    public static int Bonus;
    public static int Penalty;
    public BackendDeveloper(int Emp_id, String Emp_name, String status, String level, String department) {
        super(Emp_id, Emp_name, status, level, department);
    }

    public BackendDeveloper() {

    }

    public int getProcessTime() {
        return processTime;
    }

    public void setProcessTime(int processTime) {
        this.processTime = 20;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = 300000;
    }

    public static int getDeadline() {
        return deadline;
    }

    public static void setDeadline(int deadline) {
        BackendDeveloper.deadline = deadline;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getPenalty() {
        return Penalty;
    }

    public void setPenalty(int penalty) {
        Penalty = penalty;
    }
    public String position(){
        return getName() + " works in IT Company as Backend Developer.";
    }
    public String gettingSalary(){
        return "Salary: " + getSalary()+"$ per month.";
    }
    public String programLang(){
        return "He writes Python and Java";
    }
    public String checking(){
        if(deadline < processTime){
            return "He got bonus in "+ getBonus() + "tg for early done";
        }
        else{
            return "He got penalty in " + getPenalty() + "tg for late";
        }
    }
    public String BackEndInfo(){
        System.out.println(position());
        System.out.println(gettingSalary());
        System.out.println(programLang());
        System.out.println(checking());
        return "Information about Backend Developer!";
    }
}
