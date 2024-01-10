package com.mycompany.tucode;

import javax.swing.*;
import java.awt.event.*;

public class HelloFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 500;
    public static final int DEFAULT_HEIGHT = 500;

    public HelloFrame(String title) {
        super(title);
        JLabel label = new JLabel("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 50);
        JButton btn = new JButton("Show");
        btn.setBounds(120, 40, 70, 80);
        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        JComboBox cbb = new JComboBox(country);
        cbb.setBounds(30, 40, 70, 80);
        this.add(label);
        this.add(btn);
        this.add(cbb);
        this.setLayout(null);
        btn.addActionListener(
            new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: " + cbb.getItemAt(cbb.getSelectedIndex());
                label.setText(data);
            }
        });

        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
