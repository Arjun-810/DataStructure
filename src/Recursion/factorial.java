package Recursion;

import java.util.Scanner;

public class factorial {
    public static void factorial(int n,int f) {
        if (n<1){
            System.out.println(f);
            return;
        }
        factorial(n-1,f*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        factorial(n,f);
    }
}
