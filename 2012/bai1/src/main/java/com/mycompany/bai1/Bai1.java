package com.mycompany.bai1;
import Interface.formDiensp;
import java.sql.SQLException;
import javax.swing.JFrame;


public class Bai1 {

    public static void main(String[] args) throws SQLException {
        formDiensp frame = new formDiensp();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
