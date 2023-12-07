package BT;

import java.util.Scanner;

public class bai2 {

    public class Student {

        private String Code, name, birthplace;
        private float point;

        public Student() {
        }

        public Student(String Code, String name, String birthplace, float point) {
            this.Code = Code;
            this.name = name;
            this.birthplace = birthplace;
            this.point = point;
        }

        public String getCode() {
            return Code;
        }

        public void setCode(String Code) {
            this.Code = Code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBirthplace() {
            return birthplace;
        }

        public void setBirthplace(String birthplace) {
            this.birthplace = birthplace;
        }

        public float getPoint() {
            return point;
        }

        public void setPoint(float point) {
            this.point = point;
        }

    }

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
                System.out.println(lstStudent[i].Code + "\t" + lstStudent[i].name + "\t" + lstStudent[i].birthplace + "\t" + lstStudent[i].point);
            }
        }

        public Student SearchStudent() {
            String key;
            System.out.println("Nhap id: ");
            key = s.nextLine();
            for (int i = 0; i < k; i++) {
                if (lstStudent[i].Code.equals(key)) {
                    return lstStudent[i];
                }
            }
            return null;
        }
    }
}
