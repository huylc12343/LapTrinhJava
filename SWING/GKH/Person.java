/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

/**
 *
 * @author Administrator
 */
abstract class Person {
    private String SoTK;
    private String Hoten;
    private boolean GT;

    public Person() {
    }

    public Person(String SoTK, String Hoten, boolean GT) {
        this.SoTK = SoTK;
        this.Hoten = Hoten;
        this.GT = GT;
    }

    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
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
    abstract String Khuyenmai();
}
