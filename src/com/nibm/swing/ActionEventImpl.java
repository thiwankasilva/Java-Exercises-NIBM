package com.nibm.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventImpl implements ActionListener {
    private JLabel label;

    public ActionEventImpl(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
        this.label.setText("Capture Button Clicked");
    }
}
