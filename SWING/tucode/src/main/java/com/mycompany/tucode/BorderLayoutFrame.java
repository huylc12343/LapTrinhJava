package com.mycompany.tucode;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderLayoutFrame extends JFrame {

    public BorderLayoutFrame(String title) {
        super(title);
        // Use the content pane's default BorderLayout.
        setLayout(new BorderLayout(20,20));
        add(new JButton("Button 1 (NORTH)"), BorderLayout.NORTH);
        add(new JButton("Button 2 (CENTER)"), BorderLayout.CENTER);
        add(new JButton("Button 3 (WEST)"), BorderLayout.WEST);
        add(new JButton("Long-Named Button 4 (SOUTH)"), BorderLayout.SOUTH);
        JButton btn5 = new JButton("Button 5 (EAST)");
        btn5.setSize(20, 20);
        JButton btn6 = new JButton("Button 6 (EAST)");
        btn6.setSize(20, 20);
        add(btn6, BorderLayout.EAST);
        add(btn5, BorderLayout.EAST);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
