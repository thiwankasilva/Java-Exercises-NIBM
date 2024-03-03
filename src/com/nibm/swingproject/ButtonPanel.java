package com.nibm.swingproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    private JButton addBtn,deleteBtn,updateBtn;


    public ButtonPanel() {
        addBtn = new JButton("Add");
        deleteBtn = new JButton("Delete");
        updateBtn = new JButton("Update");
        initializeUI();

    }

    private void initializeUI() {
        //setBackground(new Color(40,50,60));
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello");
            }
        });
        add(addBtn);
        add(deleteBtn);
        add(updateBtn);
    }
}
