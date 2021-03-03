package com.company.repositories.interfaces;

import com.company.data.interfaces.IDB;
import com.company.entities.Manager;

import java.util.List;

public interface IManagerRepositories {
    List<Manager> getAllManagers();
    Manager getManagerByName(String name);
}
