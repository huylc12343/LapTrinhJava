package com.mycompany.tucode;

import javax.swing.JFrame;

public class Tucode {

    public static void main(String[] args) {
        TestButton frame = new TestButton("Test button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
