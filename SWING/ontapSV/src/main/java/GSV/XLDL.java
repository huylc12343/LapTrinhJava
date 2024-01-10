package GSV;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class XLDL {
    public Connection conn = null;
    public void getCon()throws SQLException{
        try{
            String username = "root";
            String password = "Tokumeisentai12";
            String url = "jdbc:mysql://localhost:3306/qlsv";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(url, username, password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Ket noi csdl that bai","Thong bao",1);
        }
    }
    public ResultSet LoadData(String sql){
        try{
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public void updateData(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public ResultSet getDanhSachSV() throws SQLException{
        getCon();
        String sql = "SELECT * FROM tbsinhvien order by KhoaId asc;";
        return LoadData(sql);
    }    
    public ResultSet getDanhSachKhoa() throws SQLException{
        getCon();
        String sql = "SELECT * FROM tbKhoa;";
        return LoadData(sql);
    }
    public void insertSV(String ma, String ht, int gt,int namsinh,String khoaid){
        String sql = "INSERT INTO `tbsinhvien`VALUES ('"+ma+"', N'"+ht+"',"+gt+","+namsinh+", '"+khoaid+"');";
        updateData(sql);
    }
}
