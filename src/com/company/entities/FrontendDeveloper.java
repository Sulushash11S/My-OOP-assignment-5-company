package com.company.entities;

public class FrontendDeveloper extends Employee {
    private int processTime;
    private int salary;
    public static int deadline;
    public static int Bonus;
    public static int Penalty;

    public FrontendDeveloper(int processTime, int salary, int deadline, int bonus, int penalty){
        setProcessTime(processTime);
        setSalary(salary);
        setDeadline(deadline);
        setBonus(bonus);
        setPenalty(penalty);
    }
    public FrontendDeveloper(int Emp_id,String Emp_name,String status, String level, String department){
        super(Emp_id,Emp_name,status,level,department);
    }

    public FrontendDeveloper() {

    }

    public int getProcessTime() {
        return processTime;
    }

    public void setProcessTime(int day) {
        this.processTime = day;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = 20000;
    }

    public static int getDeadline() {
        return deadline;
    }

    public static void setDeadline(int deadline) {
        FrontendDeveloper.deadline = deadline;
    }

    public int getBonus() {
        return Bonus;
    }

    public static void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getPenalty() {
        return Penalty;
    }

    public static void setPenalty(int penalty) {
        Penalty = penalty;
    }
    public String position(){
        return getName() + " works in IT Company as Frontend Developer.";
    }
    public String gettingSalary(){
        return "Salary: " + getSalary()+"tg per month.";
    }
    public String programLang(){
        return "He writes HTML and CSS";
    }
    public String checking(){
        if(deadline < processTime){
            return "He got bonus in "+ getBonus() + "tg for early done";
        }
        else{
            return "He got penalty in " + getPenalty() + "tg for late";
        }
    }
    public String FrontEndInfo(){
        System.out.println(position());
        System.out.println(gettingSalary());
        System.out.println(programLang());
        System.out.println(checking());
        return "Information about Frontend Developer!";
    }

}
