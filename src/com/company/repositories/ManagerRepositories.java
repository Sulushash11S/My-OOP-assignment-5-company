package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Manager;
import com.company.repositories.interfaces.IManagerRepositories;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ManagerRepositories implements IManagerRepositories {
    private final IDB db;

    public ManagerRepositories(IDB db) {
        this.db = db;
    }

    @Override
    public List<Manager> getAllManagers() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = ("SELECT id,name, status, level, department FROM Manager");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Manager> managers = new LinkedList<>();
            while (rs.next()) {
                Manager manager = new Manager(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                managers.add(manager);
            }
            return managers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Manager getManagerByName(String name) {
        Connection con = null;
        try{
            con = db.getConnection();
            String sql = "SELECT id, name, status, level, department FROM Manager WHERE name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Manager manager=new Manager (rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                return manager;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
