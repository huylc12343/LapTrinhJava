package GKH;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Administrator
 */
public class XLKH {
    public Connection conn = null;
    public void getCon()throws SQLException{
        try{
            String username = "root";
            String password = "Tokumeisentai12";
            String url = "jdbc:mysql://localhost:3306/qlkh";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(url,username, password);
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Ket noi csdl that bai","Thong bao",1);
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
    public void updateData(String sql){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public ResultSet ShowKH() throws SQLException{
        getCon();
        String sql = "SELECT * from tbkhachhang";
        return LoadData(sql);
    }
    public void InsertKH(String stk, String ht, boolean gt,String dc, double Sd){
        String gioitinh;
        if(gt == true) gioitinh = "Nu";
        else    gioitinh = "Nam";
        String sd = Double.toString(Sd);
        String sql = "Insert into tbKhachhang values('"+stk+"',N'"+ht+"',"+gioitinh+",N'"+dc+"',"+sd+");";
        updateData(sql);
    }
}
