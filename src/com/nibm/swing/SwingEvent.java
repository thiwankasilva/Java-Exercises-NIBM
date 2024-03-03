package com.nibm.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEvent extends JFrame implements ActionListener{
    private JTextField name;
    private JButton button;
    private JLabel label;

    private JButton testBtn;

    //Constructor Overloading
    public SwingEvent() throws HeadlessException {
        this("Swing Event");
    }

    public SwingEvent(String title) throws HeadlessException {
        super(title);
        InitializeUI();
    }

    private void InitializeUI() {
        this.name = new JTextField(20);
        this.button = new JButton("Capture");
        this.testBtn = new JButton("Test Button");
        this.label = new JLabel("");
        this.button.setSize(50,75);
        this.label.setSize(50,75);
        this.button.addActionListener(this);
        this.testBtn.addActionListener(this);

        //getting the container to add the UI components
        Container panel = getContentPane();
        panel.setLayout(new FlowLayout());
        panel.add(this.name);
        panel.add(this.button);
        panel.add(this.label);
        panel.add(this.testBtn);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SwingEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand().toString();
        System.out.println(btnName);
        if(btnName.equals("Capture"))
        {
            this.label.setText("Captured");
            System.out.println("Button Clicked printed on the console");
        }
        else if(btnName.equals("Test Button")){
            System.out.println("Test Button Clicked");
        }

    }
}
