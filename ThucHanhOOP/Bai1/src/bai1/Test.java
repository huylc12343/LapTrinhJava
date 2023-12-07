package bai1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap canh A: ");
        int a = nhap.nextInt();
        System.out.print("Nhap canh B: ");
        int b = nhap.nextInt();
        System.out.print("Nhap canh C: ");
        int c = nhap.nextInt();
        System.out.print("Nhap mau: ");
        String mau = nhap.next();
        System.out.print("Nhap do mau: ");
        String domau = nhap.next();
        Triangle Tamgiac = new Triangle(a, b, c, mau, domau);
        Tamgiac.KiemTra();
        System.out.println("Chu vi tam giac la: " + Tamgiac.TinhChuVi());
        System.out.println("Dien tich tam giac la: " + Tamgiac.TinhDienTich());

    }

}
