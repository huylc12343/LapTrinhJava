import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {

    public static Connection getConn() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/product-management", "root", "12345678");
        } catch (Exception e) {
            System.out.println("ERR Connect MySQL: " + e.getMessage());
        }
        return conn;
    }

    public static ResultSet loadData(String sql) {
        ResultSet result = null;
        Connection conn = getConn();
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("ERR LoadData: " + e.getMessage());
            return null;
        }
    }

    public static void updateData(String sql) {
        Connection conn = getConn();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ERR UpdateData: " + e.getMessage());
        }
    }

}
