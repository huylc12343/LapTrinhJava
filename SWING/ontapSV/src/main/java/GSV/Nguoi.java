/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSV;

/**
 *
 * @author Administrator
 */
abstract class Nguoi {
    private String Ma;
    private String Ten;
    private int GT;
    private int NamSinh;

    public Nguoi() {
    }

    public Nguoi(String Ma, String Ten, int GT, int NamSinh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.GT = GT;
        this.NamSinh = NamSinh;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getGT() {
        return GT;
    }

    public void setGT(int GT) {
        this.GT = GT;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }
    
}
