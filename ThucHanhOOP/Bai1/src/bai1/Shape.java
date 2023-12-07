package bai1;

abstract class Shape {

    private String Mau, FillMau;

    public Shape() {
    }

    public Shape(String Mau, String FillMau) {
        this.Mau = Mau;
        this.FillMau = FillMau;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public String getFillMau() {
        return FillMau;
    }

    public void setFillMau(String FillMau) {
        this.FillMau = FillMau;
    }

    abstract void KiemTra();

    abstract double TinhDienTich();

    abstract double TinhChuVi();
}

