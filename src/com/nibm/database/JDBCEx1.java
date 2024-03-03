package com.nibm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCEx1 {
    public static void main(String args[]) {
        try {
            //Step1 load the driver class
            //Class.forName(“com.mysql.cj.jdbc”);
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            //Step2 create the connection object with the connection string
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nibm", "root", "root");

            //Step3 create the statement object
            Statement stmt = con.createStatement();

            // rs is a type of ResultSet Object
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE age = '26'");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


