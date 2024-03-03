package com.nibm.swingproject;

import java.sql.*;

public class DatabaseOperationsContacts {
    private Connection connection;
    private Statement statement;
    private String connectionUrl = "jdbc:mysql://localhost:3306/nibm";

    public DatabaseOperationsContacts() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            this.connection = DriverManager.getConnection(connectionUrl, "root", "root");
            this.statement = this.connection.createStatement();
            System.out.println("Database connected...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addContact(String name,String phoneNumber) {
        String sql = "INSERT INTO CONTACTS(name,phoneNumber) VALUES(?,?)";
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql.toString());
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,phoneNumber);
            int rowInserted = preparedStatement.executeUpdate();
            if(rowInserted >0)
            {
                System.out.println("Record insered Successfully");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                preparedStatement.close();
                connection.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

        }
    }
}
