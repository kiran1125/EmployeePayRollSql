package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayRollServiceSQL {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/employeepayrollservice";
        String uName = "root";
        String password = "9966988298k";

        //Connecting to the mysql database

        try {
            Connection connection = DriverManager.getConnection(dbUrl,uName,password);
            if (connection != null)
                System.out.println("connection is successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
