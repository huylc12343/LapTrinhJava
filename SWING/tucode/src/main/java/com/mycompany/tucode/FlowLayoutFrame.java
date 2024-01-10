package com.mycompany.tucode;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

public class FlowLayoutFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 500;
    public static final int DAFAULT_HEIGHT = 500;

    public FlowLayoutFrame(String title) {
        super(title);
        this.setLayout(new FlowLayout());
        JButton btn1 = new JButton("Nut 1");
        this.add(btn1);
        this.add(new JButton("2"));
        this.add(new JButton("Button 3"));
        this.add(new JButton("Long-Named Button 4"));
        this.add(new JButton("Button 5"));
        this.pack();
    }
}
