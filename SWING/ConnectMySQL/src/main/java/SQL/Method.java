package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Method {

    public ResultSet loadProducts() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM LoaiSP";
        return cn.LoadData(sql);
    }

    public ResultSet loadProduct(String code) throws SQLException {
        String sql = "SELECT * FROM LoaiSP where code='" + code + "'";
        return cn.LoadData(sql);
    }

    public void insertData(String ml, String tl) throws SQLException {
        String sql = "INSERT INTO LoaiSP values('" + ml + "', N'" + tl + "')";
        cn.UpdateData(sql);
    }

    public void editData(String code, String name) throws SQLException {
        String sql = "Update LoaiSP set name=N'" + name
                + "' where code='" + code + "'";
        cn.UpdateData(sql);
    }

    public void deleteData(String ml) throws SQLException {
        String sql = "Delete from LoaiSP where Maloai='" + ml + "'";
        cn.UpdateData(sql);
    }

//Hiển thị Sản phẩm trên danh sách
    public void getProducts() {
        ArrayList<Product> lstProduct = new ArrayList();
        String sql = "SELECT * FROM products";
        try {
            ResultSet rs = ConnectMySQL.loadData(sql);

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCode(rs.getString("code"));
                lstProduct.add(product);
            }
        } catch (SQLException ex) {
        }
    }

}
