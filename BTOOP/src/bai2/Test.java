
package bai2;

import java.util.Scanner;

public class Test {

    private int n, k;
    Scanner s = new Scanner(System.in);
    private Student[] lstStudent = new Student[k];

    public Test(int n) {
        if (n > 0 && n <= 100) {
            this.n = n;
        }
    }

    public void setK(int k) {
        this.k = k;
    }

    public void InsertStudent() {
        System.out.println("Nhap k: ");
        k = s.nextInt();       
        if (k <= n) {
            setK(k);
            for (int i = 0; i < k; i++) {
                String id, ten, noisinh;
                float diem;
                s.nextLine();
                System.out.println("Nhap id: ");
                id = s.nextLine();
                System.out.println("Nhap ten: ");
                ten = s.nextLine();
                System.out.println("Nhap noi sinh: ");
                noisinh = s.nextLine();
                System.out.println("Nhap diem: ");
                diem = s.nextFloat();
                lstStudent[i] = new Student(id, ten, noisinh, diem);
            }
        }
    }

    public void DisplayStudent() {
        System.out.println("Code\tHo va ten\tNoi sinh\tDiem");
        for (int i = 0; i < k; i++) {
            System.out.println(lstStudent[i].getCode() + "\t" + lstStudent[i].getName() + "\t" + lstStudent[i].getBirthplace() + "\t" + lstStudent[i].getPoint());
        }
    }

    public Student SearchStudent() {
        String key;
        System.out.println("Nhap Ten: ");
        key = s.nextLine();
        for (int i = 0; i < k; i++) {
            if (lstStudent[i].getName().equals(key)) {
                return lstStudent[i];
            }
        }
        return null;
    }
}
