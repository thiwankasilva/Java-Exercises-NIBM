package com.nibm.database;

import javax.swing.*;
import java.awt.*;

public class NavigationPanel extends JPanel {

    private JLabel name;

    public NavigationPanel() {

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(100,50));
        this.name = new JLabel();
        initializeUI();
    }

    private void initializeUI() {
        JPanel colouredPanel = new JPanel();
        name.setText("Contact List Application");
        name.setHorizontalAlignment(SwingConstants.CENTER);
        colouredPanel.setBackground(new Color(97, 163, 186));
        colouredPanel.add(name);
        JPanel emptyPanel = new JPanel();
        emptyPanel.setPreferredSize(new Dimension(100,10));
        add(colouredPanel,BorderLayout.CENTER);
        add(emptyPanel,BorderLayout.SOUTH);

    }

}
