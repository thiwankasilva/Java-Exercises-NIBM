package com.nibm.swing;

import javax.swing.*;
import java.awt.*;

public class SwingEvent2 extends JFrame{
    private JTextField name;
    private JButton button;
    private JLabel label;

    public SwingEvent2() throws HeadlessException {
        this("Event handling type 2");
    }

    public SwingEvent2(String title) throws HeadlessException {
        super(title);
        intializeUI();
    }

    private void intializeUI() {
        this.name = new JTextField(8);
        this.button = new JButton("Capture");
        this.label = new JLabel("");

        this.button.setSize(50, 75);
        //we have added the action listener in a seperate class called ActionEventImpl
        this.button.addActionListener(new ActionEventImpl(label));
        this.label.setSize(50, 75);

        Container panel = getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(this.name);
        panel.add(this.button);
        panel.add(this.label);
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingEvent2 swingEvent2 = new SwingEvent2();
    }
}
