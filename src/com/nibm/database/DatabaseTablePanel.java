package com.nibm.database;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;

public class DatabaseTablePanel extends JPanel {

    private DatabaseOperations databaseOperations;


    private JTable table;
    public DatabaseTablePanel()  {

        setLayout(new BorderLayout());
        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel();

        // Set column names
        model.setColumnIdentifiers(new Object[]{"ID","Name", "PhoneNumber"});

        // Retrieve data from the database
        fetchDataFromDatabase(model);

        // Create the JTable with the DefaultTableModel
        table = new JTable(model);
        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the frame
        add(scrollPane,BorderLayout.CENTER);
        // Display the frame
        setVisible(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MouseActionImpl mouseAction = new MouseActionImpl(table);
        table.addMouseListener(mouseAction);

    }

    private void fetchDataFromDatabase(DefaultTableModel model) {
        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/nibm";
        String username = "root";
        String password = "root";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query to retrieve data
            ResultSet rs = statement.executeQuery("SELECT * FROM contacts");

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

            // Close the resources
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
