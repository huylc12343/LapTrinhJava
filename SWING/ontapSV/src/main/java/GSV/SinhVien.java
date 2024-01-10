/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSV;

/**
 *
 * @author Administrator
 */
public class SinhVien extends Nguoi {
    private String KhoaId;

    public SinhVien() {
    }

    public SinhVien(String Ma, String Ten, int GT, int NamSinh,String KhoaId) {
        super(Ma, Ten, GT, NamSinh);
        this.KhoaId = KhoaId;
    }

    public String getKhoaId() {
        return KhoaId;
    }

    public void setKhoaId(String KhoaId) {
        this.KhoaId = KhoaId;
    }


    
}
