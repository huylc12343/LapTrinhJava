abstract class MatHang {
    private String maMH, ten;
    private double dongia;

    public MatHang() {
    }

    public MatHang(String maMH, String ten, double dongia) {
        this.maMH = maMH;
        this.ten = ten;
        this.dongia = dongia;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    abstract void Nhap();
    abstract void HienThi();
}
