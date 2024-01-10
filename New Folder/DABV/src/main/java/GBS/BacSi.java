package GBS;

/**
 *
 * @author Administrator
 */
public class BacSi extends NhanVien {

    private String Khoa;

    public BacSi() {
    }

    public BacSi(String Khoa) {
        this.Khoa = Khoa;
    }

    public BacSi(String Khoa, String Ma, String Hoten, boolean GT, double Luong) {
        super(Ma, Hoten, GT, Luong);
        this.Khoa = Khoa;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    @Override
    double tinhLuongThuong() {
        return getLuong()*0.8;
    }

}
