package com.nibm.swing;

import java.awt.*;

public class MyFirstWindow extends Frame {
    public MyFirstWindow(String title) throws HeadlessException {
        super(title);
        setup();
    }

    private void setup(){
        Color color = new Color(212,203,208);
        setBackground(color);
        setSize(200,200);
        add(new Label("Hello World!"));
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFirstWindow w = new MyFirstWindow("My First Window");
    }
}
