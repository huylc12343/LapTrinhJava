package com.mycompany.qlsanpham;

import Interface.frmCapnhatLoaiSP;
import java.sql.SQLException;
import javax.swing.JFrame;

public class QLSanpham {

    public static void main(String[] args) throws SQLException {
        frmCapnhatLoaiSP f = new frmCapnhatLoaiSP();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
