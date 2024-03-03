package com.nibm.database;

import com.mysql.cj.jdbc.Driver;

import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DatabaseOperations {
    private Connection connection;
    private Statement statement;
    private String connectionUrl = "jdbc:mysql://localhost:3306/nibm";

    public DatabaseOperations() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(connectionUrl, "root", "root");
            this.statement = this.connection.createStatement();
            System.out.println("Database connected...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void add(String name, String number) throws SQLException {
        String sql = "INSERT INTO Contacts (name, phoneNumber) VALUES (?, ?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, number);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public DefaultTableModel fetchFromDatabase(DefaultTableModel model)
    {
        ResultSet rs = null;
        try {
            rs = statement.executeQuery("SELECT * FROM contacts");

        // Iterate through the result set and add data to the model
        while (rs.next()) {
            int ID;
            String name;
            String number;
            model.addRow(new Object[]{
                    ID = rs.getInt("ID"),
                    name = rs.getString("Name"),
                    number = rs.getString("PhoneNumber"),
            });
        }


    } catch (Exception e) {
        e.printStackTrace();
    }
        finally {
            // Close the resources
            try {
                rs.close();
                statement.close();
                connection.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        return model;
    }


}
