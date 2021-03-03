package com.company.controllers;

import com.company.entities.Manager;
import com.company.repositories.interfaces.IManagerRepositories;

import java.util.List;

public class ManagerController {
    private final IManagerRepositories repo1;
    public ManagerController(IManagerRepositories repo1) {
        this.repo1 = repo1;
    }

    public String getAllManagers(){
        List<Manager> manager = repo1.getAllManagers();
        return manager.toString();
    }
    public String getManagerByName(String name){
        Manager manager = repo1.getManagerByName(name);
        return (manager==null ? "Manager was not found" : manager.ManagerInfo());
    }
}
