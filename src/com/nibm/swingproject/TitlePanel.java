package com.nibm.swingproject;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {

    private JLabel title;

    public TitlePanel() {
        this.title = new JLabel();
        setLayout(new BorderLayout());
        initializeTitleBarUI();

    }

    private void initializeTitleBarUI() {
        JPanel coloredPanel = new JPanel();
        title.setText("My Contacts");
        coloredPanel.setBackground(new Color(97, 163, 186));;
        coloredPanel.add(title);

        JPanel emptyPanel = new JPanel();
        emptyPanel.setPreferredSize(new Dimension(getWidth(),15));

        add(coloredPanel,BorderLayout.CENTER);
        add(emptyPanel,BorderLayout.SOUTH);

    }
}
