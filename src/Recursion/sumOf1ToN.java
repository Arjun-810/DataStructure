package Recursion;

import java.util.Scanner;

public class sumOf1ToN {
    static int sum = 0;

    public static void sum(int i, int n) {
        if (i>n) return;
        sum += i;
        sum(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(1,n);
        System.out.println(sum);
    }
}
