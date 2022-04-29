package BST;

import java.util.Scanner;

public class pattern {
    public static void pattern(int n) {
        for (int i=0; i<n; i++){
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i= n+1; i>= 1; i--) {
            for (int j=n+1; j>i;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n/2);
    }
}
