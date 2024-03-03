package com.nibm.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {

    //Defined the colors in a string array
    String[] labels = {"Yellow", "Green", "Orange", "Red", "Blue", "White", "Black"};

     //Constructor for the class
    public FlowLayoutEx1() {
        //Super will call the parents constructor (JFrame constructor)
        super("Flow layout example");
        //Call the setup function to display the UIs
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new FlowLayout());
        for (String label : labels) {
            getContentPane().add(new Button(label));
        }
        getContentPane().add(new Label("Extra"));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutEx1();
    }
}
