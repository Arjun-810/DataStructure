package Recursion;

import java.util.Scanner;

public class ptintNTo1 {
    public static void print(int i,int n) {
        if (i>=n)return;
        System.out.println(n-i);
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(0,n);
    }
}
