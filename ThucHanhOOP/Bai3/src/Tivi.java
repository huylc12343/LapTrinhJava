
import java.util.Scanner;

class Tivi extends MatHang {

    private String loaiTV, manHinh;
    Scanner s = new Scanner(System.in);

    public Tivi() {
    }

    public Tivi(String loaiTV, String manHinh, String maMH, String ten, double dongia) {
        super(maMH, ten, dongia);
        this.loaiTV = loaiTV;
        this.manHinh = manHinh;
    }

    public String getLoaiTV() {
        return loaiTV;
    }

    public void setLoaiTV(String loaiTV) {
        this.loaiTV = loaiTV;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

    @Override
    public void Nhap() {
        System.out.println("Nhap thong tin cho Tivi:");
        System.out.print("Nhap ma MH: ");
        setMaMH(s.nextLine());
        System.out.print("Nhap ten MH: ");
        setTen(s.nextLine());
        System.out.print("Nhap don gia: ");
        setDongia(s.nextDouble());
        s.nextLine(); // Đọc dòng trống
        System.out.print("Nhap loai Tivi: ");
        setLoaiTV(s.nextLine());
        System.out.print("Nhap do lon man hinh: ");
        setManHinh(s.nextLine());
    }

    @Override
    public void HienThi() {
        System.out.println("Thong tin Tivi:");
        System.out.println("Ma MH: " + getMaMH());
        System.out.println("Ten MH: " + getTen());
        System.out.println("Don gia: " + getDongia());
        System.out.println("Loai Tivi: " + getLoaiTV());
        System.out.println("Do lon man hinh: " + getManHinh());
    }

}
