/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSV;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class XLDL {
    public Connection conn = null;

    public void getCon() throws SQLException {
        try {
            String username = "root";
            String password = "Tokumeisentai12";
            String url = "jdbc:mysql://localhost:3306/benhvien";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ket noi csdl that bai", "Thong bao", 1);
        }
    }

    public ResultSet LoadData(String sql) {
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateData(String sql) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getDanhSachSV() throws SQLException{
        getCon();
        String sql = "SELECT * FROM tbsinhvien order by Ten asc";
        return LoadData(sql);
    }
   
    public ResultSet getDanhSachKhoa() throws SQLException{
        getCon();
        String sql = "SELECT * FROM tbkhoa";
        return LoadData(sql);
    }
    public void insertSV(String msv, String ht, int gioitinh, int namsinh,String khoa){
        String gt = gioitinh+"";
        String ns = namsinh +"";
        String sql = "INSERT INTO tbsinhvien VALUES ('4', N'"+ht+"', "+gt+", "+ns+", '"+khoa+"');";
        updateData(sql);
    }
}
