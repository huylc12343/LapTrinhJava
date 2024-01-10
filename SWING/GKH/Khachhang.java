/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Administrator
 */
public class Khachhang extends Person {

    private String Diachi;
    private double Sodu;

    public Khachhang() {
    }

    public Khachhang(String Diachi, double Sodu) {
        this.Diachi = Diachi;
        this.Sodu = Sodu;
    }

    public Khachhang(String Diachi, double Sodu, String SoTK, String Hoten, boolean GT) {
        super(SoTK, Hoten, GT);
        this.Diachi = Diachi;
        this.Sodu = Sodu;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public double getSodu() {
        return Sodu;
    }

    public void setSodu(double Sodu) {
        this.Sodu = Sodu;
    }

    @Override
    public String Khuyenmai() {
        if (this.isGT()==true) {
            return "Khuyen mai";
        } else {
            return "";
        }
    }
}
