package com.mycompany.ontapsv;

import GSV.GUI_insertSV;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class OntapSV {

    public static void main(String[] args) throws SQLException {
        GUI_insertSV frame = new GUI_insertSV();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
