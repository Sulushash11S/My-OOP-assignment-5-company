package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.Employee;
import com.company.entities.Manager;
import com.company.repositories.interfaces.IMember;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Member implements IMember {
    private final IDB db;

    public Member(IDB db) {
        this.db = db;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO Employees (Emp_name,status,level,department) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, employee.getName());
            st.setString(2, employee.getStatus());
            st.setString(3, employee.getLevel());
            st.setString(4, employee.getDepartment());
            int rowsInserted = st.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert con != null;
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Employee getEmployeeByID(int Emp_id) {
        Connection con = null;
        try {
            con = db.getConnection();
            var sql = "SELECT Emp_id,Emp_name, status, level, department FROM Employees WHERE Emp_id=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, Emp_id);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee(rs.getInt("Emp_id"),
                        rs.getString("Emp_name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                return employee;
            }
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
    public Employee getEmployeeByName(String Emp_name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT Emp_id,Emp_name, status, level, department FROM Employees WHERE Emp_name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, Emp_name);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee(rs.getInt("Emp_id"),
                        rs.getString("Emp_name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                return employee;
            }
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
    public boolean removeEmployeeByLevel(String level) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement st = con.prepareStatement("DELETE FROM Employees WHERE level = ?");
            st.setString(1, level);
            st.execute();
            return true;
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
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = ("SELECT Emp_id,Emp_name, status, level, department FROM Employees");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            List<Employee> employees = new LinkedList<>();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("Emp_id"),
                        rs.getString("Emp_name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                employees.add(employee);
            }
            return employees;
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
    public Employee positionOfEmployee(String status) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT Emp_id,Emp_name, status, level, department FROM Employees WHERE status=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, status);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee(rs.getInt("Emp_id"),
                        rs.getString("Emp_name"),
                        rs.getString("status"),
                        rs.getString("level"),
                        rs.getString("department"));
                return employee;
            }
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
}

