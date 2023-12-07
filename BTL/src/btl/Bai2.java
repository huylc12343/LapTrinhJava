package btl;

import java.util.Scanner;

/**
 *
 * @author hpp
 */
public class Bai2 {

    public static class Hinhchunhat {

        protected double cd;
        protected double cr;

        public Hinhchunhat() {
            cd = 2;
            cr = 1;
        }

        public Hinhchunhat(double cd, double cr) {
            this.cd = cd;
            this.cr = cr;
        }

        public void Nhap() {
            Scanner nhap = new Scanner(System.in);
            System.out.print("Nhap chieu dai: ");
            cd = nhap.nextDouble();
            System.out.print("Nhap chieu rong: ");
            cr = nhap.nextDouble();

        }

        public void SetCD(double cd) {
            this.cd = cd;
        }

        public double GetCD() {
            return cd;
        }

        public void SetCR(double cr) {
            this.cr = cr;
        }

        public double GetCR() {
            return cr;
        }

        public double Dientich() {
            return cd * cr;
        }

        public double Chuvi() {
            return (cd + cr) * 2;
        }

        public void Xuat() {
            System.out.println("Chieu dai hinh chu nhat: " + GetCD());
            System.out.println("Chieu rong hinh chu nhat: " + GetCR());
            System.out.println("Chu vi: " + Chuvi());
            System.out.println("Dien tich: " + Dientich());
        }

    }

    public static void main(String[] args) {
        Hinhchunhat a = new Hinhchunhat();
        a.Nhap();
        a.Xuat();
    }
}
