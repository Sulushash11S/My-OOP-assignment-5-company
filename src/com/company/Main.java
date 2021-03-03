package com.company;

import com.company.controllers.EmployeeController;
import com.company.controllers.ManagerController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.ManagerRepositories;
import com.company.repositories.Member;
import com.company.repositories.interfaces.IManagerRepositories;
import com.company.repositories.interfaces.IMember;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IMember repo = new Member(db);
        IManagerRepositories repo1 = new ManagerRepositories(db);
        EmployeeController controller = new EmployeeController(repo);
        ManagerController controller1  = new ManagerController(repo1);
        MyApplication app=new MyApplication(controller, controller1);
        app.start();
    }
}
