package GBS;

/**
 *
 * @author Administrator
 */
abstract class NhanVien {
    private String Ma;
    private String Hoten;
    private boolean GT;
    private double Luong;

    public NhanVien() {

    }

    public NhanVien(String Ma, String Hoten, boolean GT, double Luong) {
        this.Ma = Ma;
        this.Hoten = Hoten;
        this.GT = GT;
        this.Luong = Luong;
    }


    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public boolean isGT() {
        return GT;
    }

    public void setGT(boolean GT) {
        this.GT = GT;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    
    abstract double tinhLuongThuong();
}
