package Process;
import java.sql.*;
import Database.ConnectMySQL;

public class Method {
    public ConnectMySQL cn = new ConnectMySQL();
    public ResultSet ShowLoaiSP() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * from LoaiSP";
        return cn.LoadData(sql);
    }
    public ResultSet ShowLoaiSP(String ml)throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * from LoaiSP where Maloai ='"+ml+"'";
        return cn.LoadData(sql);
    }
    public void InsertData(String ml,String tl)throws SQLException{
        String sql = "INSERT INTO LoaiSP values('"+ml+"',N'"+tl+"')";
        cn.UpdateData(sql);
    }
    public void EditData(String ml,String tl)throws SQLException{
        String sql = "Update LoaiSP set Tenloai = N'"+tl+"' where Maloai ='"+ml+"'";
        cn.UpdateData(sql);
    }
    public void DeleteData(String ml)throws SQLException{
        String sql = "Delete from LoaiSP where Maloai ='"+ml+"'";
        cn.UpdateData(sql);
    }
    
}
