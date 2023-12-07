/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cacbaitap;
import java.util.Scanner;

public class bai4 {
    int tuso,mauso;
    public void input(){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuso = nhap.nextInt();
        System.out.print("Nhap mau so: ");
        mauso = nhap.nextInt();
    }
    public int UCLN(int a,int b){
        if(b == 0)
            return a;
        return UCLN(b,a%b);
    }
    public void tinhtoan(){
        System.out.println("Phan so: "+tuso+"/"+mauso);
        int uoc = UCLN(tuso,mauso);
        tuso = tuso/uoc;
        mauso = mauso/uoc;
        System.out.println("Phan so sau khi rut gon la: "+tuso+"/"+mauso);
    }
}
