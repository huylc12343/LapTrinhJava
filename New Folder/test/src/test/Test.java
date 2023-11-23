package test;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        int month =2;
        int numdays = 0;
        switch(month){
            case 2:
                numdays = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numdays = 30;
                break;
            default:
                numdays = 31;
                break;
        }
        System.out.println("num of day = "+numdays);
            

    }
    
}
