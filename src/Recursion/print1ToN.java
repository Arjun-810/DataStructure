package Recursion;

import java.util.Scanner;

public class print1ToN {
    public static void printLinear(int i,int n) {
        if (i>n)return;
        System.out.println(i);
        printLinear(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLinear(1,n);
    }
}
