package cacbaitap;

import java.util.Scanner;

public class bai2 {
    public int n;
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap N: ");
        n = nhap.nextInt();
    }
    public void tinhtoan(){
        if(n>0){
            int ans = 1;
            for(int i = 1;i<=n;i++){
                ans *= i;
            }
            System.out.println("Giai thua cua n la: "+ans ); 
        }else{
            System.out.println("Ban da nhap so nho hon 0!!");
        }
    }
}
