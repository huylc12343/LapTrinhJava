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
    private String ma;
    private String ht;
    private int gt;
    private int namsinh;

    public Nguoi() {
    }

    public Nguoi(String ma, String ht, int gt, int namsinh) {
        this.ma = ma;
        this.ht = ht;
        this.gt = gt;
        this.namsinh = namsinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public int getGt() {
        return gt;
    }

    public void setGt(int gt) {
        this.gt = gt;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
}
