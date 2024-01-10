package Bai2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Test kiemthu = new Test();
        String id , ten, noisinh;
        double diem;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Nhap id: ");
            id = s.nextLine();
            System.out.println("Nhap ten: ");
            ten = s.nextLine();
            System.out.println("Nhap noi sinh: ");
            noisinh = s.nextLine();
            System.out.println("Nhap diem: ");
            diem = s.nextDouble();
            s.nextLine();
            if(!id.contains("n"))   kiemthu.InsertStudent(id, ten, noisinh, diem);
        } while(!id.contains("n"));
        kiemthu.DisplayStudent();
    }
}
