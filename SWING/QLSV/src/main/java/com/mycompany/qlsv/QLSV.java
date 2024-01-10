package com.mycompany.qlsv;

import GSV.GUI_insertSV;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class QLSV {

    public static void main(String[] args) throws SQLException {
        GUI_insertSV frame = new GUI_insertSV();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
