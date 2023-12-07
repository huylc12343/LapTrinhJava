/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT;

/**
 *
 * @author Administrator
 */
public class bai1 {
    abstract class Shape{
        private String Mau;
        abstract void FillMau();
        
        public Shape() {
        }

        public Shape(String Mau) {
            this.Mau = Mau;
        }
        
        public String getMau() {
            return Mau;
        }
        public void setMau(String Mau) {
            this.Mau = Mau;
        }
        abstract boolean Kiemtra();
        abstract int TinhDienTich();
        abstract int TinhChuVi();
    }
}
