package GBS;

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

    public ResultSet getBS() throws SQLException {
        getCon();
        String sql = "SELECT  * from tbbacsi";
        return LoadData(sql);
    }

    public void insertBS(String ma, String ht, boolean gt, String khoa, double luong) {
        String gioitinh;
        if (gt == true) {
            gioitinh = "0";
        } else {
            gioitinh = "1";
        }
        String luong1 = Double.toString(luong);
        String sql = "INSERT INTO tbbacsi VALUES ('"+ma+"', N'"+ht+"', "+gioitinh+", N'"+khoa+"', "+luong1+");";
        updateData(sql);
    }

}
