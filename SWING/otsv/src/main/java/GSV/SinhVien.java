package GSV;

/**
 *
 * @author Administrator
 */
public class SinhVien extends Nguoi{
    private String khoa;

    public SinhVien() {
    }

    public SinhVien(String khoa, String ma, String ht, int gt, int namsinh) {
        super(ma, ht, gt, namsinh);
        this.khoa = khoa;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    
    
}
