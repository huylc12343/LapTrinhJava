package bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class Bai1 {
    
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    Scanner nhap = new Scanner(System.in);
    System.out.print("Nhap so: ");
    int a = nhap.nextInt();
    int b = nhap.nextInt();
    int c = nhap.nextInt();
    if(a>0&&b>0&&c>0){
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("3 canh la canh cua tam giac");
            int chuvi = a+b+c;
            System.out.println("Chu vi hinh tam giac la: "+chuvi);
            float P = chuvi/2;
            float dientich = (float) sqrt((P * (P - a) * (P - b) * (P - c)));
            System.out.println("dien tich tam giac la: "+dientich);
        }else{
            System.out.println("3 canh khong phai la 3 canh tam giac");
        }
    }else{
        System.out.println("Hay nhap 3 so nguyen duong");
    }
    }
    
    
}
