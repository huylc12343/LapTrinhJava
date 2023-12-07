
package cacbaitap;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai3 {
    float a,b;
    char pheptoan;
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = nhap.nextFloat();
        System.out.print("Nhap b: ");
        b = nhap.nextFloat();
        System.out.print("Nhap phep toan: ");
        pheptoan = nhap.next().charAt(0);
    }
    public boolean kiemTra(char toantu){
        if(toantu == '+' || toantu == '-' || toantu == '*' || toantu == '/') return true;
        else return false;
    }
    public float solved(float a,float b, char toantu){
        float ans = 0;
        switch(toantu){
            case '+' -> ans = a+b;
            case '-' -> ans = a-b;
            case '*' -> ans = a*b;
            case '/' -> ans = a/b;
        }
        return ans;
    }
    public void tinhtoan(){
        if(pheptoan == '/' && b == 0){
            System.out.println("Loi chia cho 0");
        }
        else if(kiemTra(pheptoan)){
            System.out.println("ket qua: "+solved(a,b,pheptoan));
        }else{
            System.out.println("Ban nhap sai phep toan");
        }
    }
}
