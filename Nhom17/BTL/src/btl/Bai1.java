package btl;

import java.util.Scanner;

public class Bai1 {

    public static class nhanVien {

        private String name, diaChi;
        private int age, soGioLam;
        private double salary;

        public nhanVien() {
        }

        public nhanVien(String name, String diaChi, int age, int soGioLam, double salary) {
            this.name = name;
            this.diaChi = diaChi;
            this.age = age;
            this.soGioLam = soGioLam;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public int getSoGioLam() {
            return soGioLam;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setSoGioLam(int soGioLam) {
            this.soGioLam = soGioLam;
        }

        public nhanVien nhapNV() {
            Scanner nhap = new Scanner(System.in);
            System.out.print("\nNhap ten: ");
            name = nhap.nextLine();
            System.out.print("Nhap dia chi: ");
            diaChi = nhap.nextLine();
            System.out.print("Nhap tuoi: ");
            age = nhap.nextInt();
            System.out.print("Nhap so gio lam: ");
            soGioLam = nhap.nextInt();
            System.out.print("Nhap luong: ");
            salary = nhap.nextDouble();
            nhanVien a = new nhanVien(name, diaChi, age, soGioLam, salary);
            return a;
        }

        public void xuatNV() {
            System.out.println(this.name + "\t" + this.diaChi + "\t" + this.age + "\t" + this.soGioLam + "\t" + this.salary);
        }

        public double tinhThuong() {
            double thuong = 0;
            if (soGioLam >= 200) {
                thuong = salary * 20 / 100;
            } else if (soGioLam < 200 && soGioLam >= 100) {
                thuong = salary * 10 / 100;
            } else {
                thuong = 0;
            }
            return thuong;
        }
    }

    public static void main(String[] args) {
        nhanVien a = new nhanVien();
        a = a.nhapNV();
        System.out.println("Ten\tDia chi\tTuoi\tGio lam\tLuong");
        a.xuatNV();
        System.out.println("Tien thuong la: "+a.tinhThuong());
    }

}
