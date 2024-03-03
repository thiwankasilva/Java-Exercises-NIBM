package com.nibm.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class ContactListApp extends JFrame {
    private JTextField nameField, phoneField;
    private JButton addButton, updateButton, deleteButton;

    public ContactListApp() {
        setTitle("Contact List Application");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel navigationPanel = new NavigationPanel();
        // Add navigation buttons here
        JPanel inputPanel = new JPanel(new GridLayout(3, 2,10,5));
        inputPanel.add(new JLabel("Name: "));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone: "));
        phoneField = new JTextField();
        inputPanel.add(phoneField);

        JPanel inputAndNav = new JPanel(new BorderLayout());

        inputAndNav.add(navigationPanel,BorderLayout.NORTH);
        inputAndNav.add(inputPanel,BorderLayout.CENTER);


        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        JPanel contactPanel = new DatabaseTablePanel();
        // ADD operation

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String phone = phoneField.getText().trim();
                if (!name.isEmpty() && !phone.isEmpty()) {
                    //Contact contact = new Contact(name, phone);
                    try {
                        DatabaseOperations databaseOperations = new DatabaseOperations();
                        databaseOperations.add(name,phone);


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                    // Clear input fields after adding
                    nameField.setText("");
                    phoneField.setText("");
                } else {
                    JOptionPane.showMessageDialog(ContactListApp.this,
                            "Please enter both name and phone number",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);


        JPanel emptyPanel = new JPanel();

        add(inputAndNav, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
        add(emptyPanel, BorderLayout.WEST);
        add(contactPanel, BorderLayout.CENTER);


        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ContactListApp());
    }
}
