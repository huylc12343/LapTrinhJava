package com.mycompany.tucode;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestButton extends JFrame{

    JFrame frame;
    JButton button;

    public TestButton (String title) {
        super(title);
        frame = new JFrame("Test");
        button = new JButton("Press Me!");
        button.setActionCommand("ButtonPressed");
        // register event listener for button      
        button.addActionListener(new ButtonHandler());
        frame.add(button, BorderLayout.CENTER);
    }

    public void launchFrame() {
        frame.pack();
        frame.setVisible(true);
    }
}

class ButtonHandler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Action occurred");
        System.out.println("Button’s command is: "
                + e.getActionCommand()
        );
    }
}
