package com.mycompany.dabv;

import GBS.GUI_insertBS;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class DABV {

    public static void main(String[] args) throws SQLException {
        GUI_insertBS frame = new GUI_insertBS();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
