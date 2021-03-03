package com.company;

import com.company.controllers.EmployeeController;
import com.company.controllers.ManagerController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final EmployeeController controller;
    private final ManagerController controller1;
    private final Scanner scanner;

    public MyApplication(EmployeeController controller, ManagerController controller1){
        this.controller = controller;
        this.controller1 = controller1;
        scanner = new Scanner(System.in);
    }

    public void start(){
        while (true){
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option: (1-8)");
            System.out.println("1. Get all employees");
            System.out.println("2. Get employee by id");
            System.out.println("3. Get employee by name");
            System.out.println("4. Get employee by status");
            System.out.println("5. Add employee");
            System.out.println("6. Remove employee by level");
            System.out.println("7. Get all Managers");
            System.out.println("8. Get Manager by name");
            System.out.println("0. Exit");
            System.out.println();
            try{
                System.out.println("Enter the option: (1-8)");
                int option = scanner.nextInt();
                if(option==1){
                    getAllEmployeesMenu();
                }
                else if(option==2){
                    getEmployeeByIdMenu();
                }
                else if(option==3){
                    getEmployeeByNameMenu();
                }
                else if(option==4){
                    positionOfEmployeeMenu();
                }
                else if(option==5){
                    addEmployeeMenu();
                }
                else if(option==6){
                    removeEmployeeByLevelMenu();
                }
                else if(option==7){
                    getAllManagersMenu();
                }
                else if(option==8){
                    getManagerByNameMenu();
                }
                else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Input must be integer");
                scanner.nextLine();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }

    private void getManagerByNameMenu() {
        System.out.println("Please enter name:");
        String name = scanner.next();
        String response = controller1.getManagerByName(name);
        System.out.println(response);
    }

    private void getAllManagersMenu() {
        String response = controller1.getAllManagers();
        System.out.println(response);
    }

    public void getAllEmployeesMenu(){
        String response = controller.getAllEmployees();
        System.out.println(response);
    }
    public void getEmployeeByIdMenu(){
        System.out.println("Please enter id:");
        int Emp_id = scanner.nextInt();
        String response = controller.getEmployeeByID(Emp_id);
        System.out.println(response);
    }
    public void getEmployeeByNameMenu(){
        System.out.println("Please enter name:");
        String Emp_name= scanner.next();
        String response = controller.getEmployeeByName(Emp_name);
        System.out.println(response);
    }
    public void positionOfEmployeeMenu(){
        System.out.println("Please enter status:");
        String status = scanner.next();
        String response = controller.positionOfEmployee(status);
        System.out.println(response);
    }
    public void addEmployeeMenu(){
        System.out.println("Please enter name:");
        String Emp_name = scanner.next();
        System.out.println("Please enter status:");
        String status = scanner.next();
        System.out.println("Please enter level:");
        String level = scanner.next();
        System.out.println("Please enter department:");
        String department = scanner.next();
        String response = controller.addEmployee(Emp_name,status,level,department);
        System.out.println(response);
    }
    public void removeEmployeeByLevelMenu(){
        System.out.println("Please enter level:");
        String level = scanner.next();
        String response = controller.removeEmployeeByLevel(level);
        System.out.println(response);
    }
}
