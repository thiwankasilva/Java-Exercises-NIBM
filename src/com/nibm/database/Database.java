package com.nibm.database;

import java.sql.*;

public class Database {
    private Connection connection;
    private Statement statement;
    private String connectionUrl = "jdbc:mysql://localhost:3306/nibm";

    public Database() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            this.connection = DriverManager.getConnection(connectionUrl, "root", "root");
            this.statement = this.connection.createStatement();
            System.out.println("Database connected...");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
    public void add(String firstname, String lastname, String designation, String email, String mobile, int age)throws SQLException {
        StringBuilder sql = new StringBuilder("INSERT INTO Employee (FirstName, LastName, Designation, Email, Telephone, Age) ");
        sql.append("VALUES( ");
        sql.append("'").append(firstname).append("',");
        sql.append("'").append(lastname).append("',");
        sql.append("'").append(designation).append("',");
        sql.append("'").append(email).append("',");
        sql.append("'").append(mobile).append("',");
        sql.append(age); sql.append(")");
        System.out.println(sql.toString());
        try {
            int status = this.statement.executeUpdate(sql.toString());
            if (status > 0) { System.out.println("Record inserted successfully"); }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
    public void listAll() throws SQLException
    {
        StringBuilder sql = new StringBuilder("SELECT * FROM Employee;");
        ResultSet rs = this.statement.executeQuery(sql.toString());
        while (rs.next()) {
            Integer ID = rs.getInt("ID");
            String firstname = rs.getString("FirstName");
            String lastname = rs.getString("LastName");
            String designation = rs.getString("Designation");
            String email = rs.getString("Email");
            String mobile = rs.getString("Telephone");
            Integer age = rs.getInt("Age");
            System.out.println(ID);
            System.out.println(firstname);
            System.out.println(lastname);
            System.out.println(designation);
            System.out.println(email);
            System.out.println(mobile); System.out.println(age);
            System.out.println("---------");
        }
        rs.close();
    }


    public static void main(String[] args) throws SQLException {
        Database db = new Database();
//        for(int i=1 ;i<11;i++)
//        {
//            db.add("Thiwanka"+i,"Silva","SE","thiwanka@gmail.com","1234",26);
//
//        }
        db.listAll();
        ///db.add("Thiwanka","Silva","SE","thiwanka@gmail.com","1234",26);
    }


}