package com.nibm.swingproject;

import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private JLabel name,phoneNumber;
    private JTextField nameField,phoneNumberField;

    public InputPanel() {
        setLayout(new GridLayout(3,2,6,6));
        InitializeUI();

    }

    private void InitializeUI() {
        name = new JLabel("Name :");
        phoneNumber = new JLabel("Phone Number :");
        nameField = new JTextField(12);
        nameField.setName("nameFieldName");

        phoneNumberField = new JTextField(13);
        phoneNumberField.setName("phoneNumberFieldName");
        add(name); //row 1 col 1
        add(nameField); //row 1 col2
        add(phoneNumber); //row 2 col1
        add(phoneNumberField);//row 2 col2

    }

    //defined getters to get these values out
    public JTextField getPhoneNumberField() {
        return phoneNumberField;
    }

    public JTextField getNameField() {
        return nameField;
    }
}
