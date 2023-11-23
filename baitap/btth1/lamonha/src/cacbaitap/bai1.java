package cacbaitap;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai1 {
    
    public int a,b,c;
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so A: ");
        a = nhap.nextInt();
        System.out.print("Nhap so B: ");
        b = nhap.nextInt();
        System.out.print("Nhap so C: ");
        c = nhap.nextInt();
    }
    public void tinhtoan(){
        if(a>0&&b>0&&c>0){
            if(a+b>c && a+c>b && b+c>a){
                System.out.println("3 canh la canh cua tam giac");
                float chuvi = a+b+c;
                System.out.println("Chu vi hinh tam giac la: "+chuvi);
                float P = chuvi/2;
                float dientich = (float) sqrt((P * (P - a) * (P - b) * (P - c)));
                System.out.println("dien tich tam giac la: " + dientich);
            }else{
                System.out.println("3 canh khong phai la 3 canh tam giac");
            }
        }else{
            System.out.println("Hay nhap 3 so nguyen duong");
        }
        }
    }
    

