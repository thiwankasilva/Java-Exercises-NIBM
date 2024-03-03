package com.nibm.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEvent3 extends JFrame {
    private JTextField name;
    private JButton button;
    private JLabel label;

    public SwingEvent3() throws HeadlessException {
        this("Event example");
    }

    public SwingEvent3(String title) throws HeadlessException {
        super(title);
        setup();
    }

    private void setup() {
        this.name = new JTextField(8);
        this.button = new JButton("Capture");
        this.label = new JLabel("");


        this.button.setSize(50, 75);
        //Anonymous class implementation
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textInput = name.getText().trim();
                label.setText(textInput);
            }
        });

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
        new SwingEvent3();
    }
}
