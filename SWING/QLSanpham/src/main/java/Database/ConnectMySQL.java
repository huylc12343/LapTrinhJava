package Database;

import java.sql.*;
import javax.swing.*;

public class ConnectMySQL {
    public Connection conn = null;
    public void connectSQL() throws SQLException {
        
        try {
            String userName = "root";
            String password = "Tokumeisentai12";
            String url = "jdbc:mysql://localhost:3306/qlsp";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(url,userName,password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Ket noi CSDL that bai","Thong bao",1);
        }
    }
    public ResultSet LoadData(String sql){
        ResultSet result = null;
        try{
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    public void UpdateData(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
