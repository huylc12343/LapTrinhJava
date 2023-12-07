/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classPacket;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai1 {

    public static int[] nhapMang(int arr[], int n) {
        Scanner nhap = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Arr[" + i + "]: ");
            arr[i] = nhap.nextInt();
        }
        return arr;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void out(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void outPrime(int[] arr, int n) {
        System.out.println("\nCac so nguyen to trong mang la");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int maxArr(int arr[], int n) {
        int maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static int[] sortArr(int arr[], int n) {
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap N: ");
        n = nhap.nextInt();
        nhapMang(arr, n);
        out(arr, n);
        outPrime(arr, n);
        System.out.println("\nGia tri lon nhat cua mang la: "+ maxArr(arr,n));
        arr = sortArr(arr,n);
        System.out.println("Mang sau khi sap xep la: ");
        out(arr,n);
        
    }

}
