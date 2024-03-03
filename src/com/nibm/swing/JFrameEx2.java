package com.nibm.swing;

import javax.swing.*;

public class JFrameEx2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My second JFrame");
        f.getContentPane().add(new JLabel("Hello World!"));
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
