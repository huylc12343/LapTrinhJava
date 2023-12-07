package Bai2;

import java.util.Scanner;

public class Test {

    private int k = 0, n = 100;
    Student lstStudent[] = new Student[n];
    Scanner s = new Scanner(System.in);

    public int getK() {
        return k;
    }

    public Student[] getLstStudent() {
        return lstStudent;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void InsertStudent(String id,String ten,String noisinh,double diem) {
        lstStudent[k] = new Student(id, ten, noisinh, diem);
        setK(++k);
    }

    public void DisplayStudent() {
        System.out.println("Code\tHo va ten\tNoi sinh\tDiem");
        for (int i = 0; i < k; i++) {
            System.out.println(lstStudent[i].getCode() + "\t" + lstStudent[i].getName() + "\t" + lstStudent[i].getBirthplace() + "\t" + lstStudent[i].getPoint());
        }
    }
    public int SearchStudent(String key){
        for(int i = 0;i<k;i++){
            if(lstStudent[i].getName().contains(key)){
                return i;
            }
        }
        return 0;
    }
}
