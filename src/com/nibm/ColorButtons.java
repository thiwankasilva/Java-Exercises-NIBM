package com.nibm;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ColorButtons extends JFrame implements MouseListener{
    private JButton red = new JButton("Red");
    private JButton blue = new JButton("Blue");
    private JButton green = new JButton("Green");
    private JButton orange = new JButton("Orange");
    private JButton yellow = new JButton("Yellow");

    private Color defaultColor = null;

    public ColorButtons() {
        super("Multi Buttons");
        setup();
    }

    private void setup() {
        Container panel = getContentPane();
        panel.setLayout(new BorderLayout(2, 2));
        panel.add(this.red, BorderLayout.NORTH);
        panel.add(this.blue, BorderLayout.EAST);
        panel.add(this.green, BorderLayout.SOUTH);
        panel.add(this.orange, BorderLayout.WEST);
        panel.add(this.yellow, BorderLayout.CENTER);

        defaultColor = red.getBackground();

        this.red.addMouseListener(this);
        this.red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Red Button Clicked");
            }
        });
        this.blue.addMouseListener(this);
        this.green.addMouseListener(this);
        this.orange.addMouseListener(this);
        this.yellow.addMouseListener(this);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorButtons();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Release");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        doEnter(e);
        System.out.println("Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {

        doExit(e);
    }

    private void doEnter(MouseEvent e) {
        //
        String command = ((JButton) e.getSource()).getText();

        switch (command) {
            case "Red":
                ((JButton) e.getSource()).setBackground(Color.red);
                break;
            case "Blue":
                ((JButton) e.getSource()).setBackground(Color.BLUE);
                break;
            case "Green":
                ((JButton) e.getSource()).setBackground(Color.GREEN);
                break;
            case "Orange":
                ((JButton) e.getSource()).setBackground(Color.ORANGE);
                break;
            case "Yellow":
                ((JButton) e.getSource()).setBackground(Color.YELLOW);
                break;
        }
    }

    private void doExit(MouseEvent e) {
        ((JButton) e.getSource()).setBackground(defaultColor);
    }


}

