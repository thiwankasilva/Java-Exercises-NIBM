package com.nibm.swingproject;

import com.nibm.database.DatabaseTablePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.LinkedList;

public class MainScreen extends JFrame {
    private JPanel titleBar;
    private JPanel inputPanel;

    private JPanel tablePanel;

    private JPanel btnPanel;

    private JButton addBtn,deleteBtn,updateBtn;

    public MainScreen() throws HeadlessException {
        this("Contact List Application");
    }
    public MainScreen(String title) throws HeadlessException {
        super(title);
        titleBar = new TitlePanel();
        inputPanel = new InputPanel();
        tablePanel = new DatabaseTablePanel();

        addBtn = new JButton("Add");
        deleteBtn = new JButton("Delete");
        updateBtn = new JButton("Update");

        IntializeUI();
    }

    private void IntializeUI() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        JPanel titleBarAndInputPanel = new JPanel();
        //Created a new panel to include title panel and input panel
        titleBarAndInputPanel.setLayout(new BorderLayout());

        titleBarAndInputPanel.add(titleBar,BorderLayout.NORTH);
        titleBarAndInputPanel.add(inputPanel,BorderLayout.CENTER);

        container.add(titleBarAndInputPanel,BorderLayout.NORTH);

        //adding table to the center of the main screen
        container.add(tablePanel,BorderLayout.CENTER);

        //adding btn panel to south
        JPanel btnPanel = new JPanel();
        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
        //Handling add event using anonymous class
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField nameTextField = new JTextField();
                JTextField phoneNumberTextField =new JTextField();
                //Created a component array
                //inside this array it have 4 components (two text fields and two labels)
                Component[] components = inputPanel.getComponents();
                for(Component cmp : components)
                {
                    if(cmp instanceof JTextField && cmp.getName().equals("nameFieldName"))
                    {
                        nameTextField = (JTextField) cmp;
                    }
                    else if(cmp instanceof JTextField && cmp.getName().equals("phoneNumberFieldName"))
                    {
                        phoneNumberTextField = (JTextField) cmp;
                    }
                }
                if(nameTextField.getText().isEmpty() || phoneNumberTextField.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(btnPanel,"Both fields must be filled");
                }
                else {
                    System.out.println(nameTextField.getText());
                    System.out.println(phoneNumberTextField.getText());
                    try {
                        String name = nameTextField.getText().trim();
                        //Trimming means removing extra spaces
                        String phoneNumber = phoneNumberTextField.getText().trim();
                        DatabaseOperationsContacts databaseOperationsContacts = new DatabaseOperationsContacts();
                        databaseOperationsContacts.addContact(name,phoneNumber);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }


            }
        });

        container.add(btnPanel,BorderLayout.SOUTH);

        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainScreen();
    }


}
