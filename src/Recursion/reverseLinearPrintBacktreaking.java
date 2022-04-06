package Recursion;

import java.util.Scanner;

public class reverseLinearPrintBacktreaking {
    public static void print(int i,int n) {
        if (i>n) return;
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }
}
