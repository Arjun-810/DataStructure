package bitMagic;

import java.util.Scanner;

public class powerSet {
    public static void powSet(String s) {
        int n = s.length();
        int x = (int)Math.pow(2,n);
        System.out.println(x);
        for (int i = 0; i < x; i++) {
            for (int j=0;j<n;j++){
                if ((i&(i<<j)) != 0) System.out.print(s.charAt(j));
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        powSet(str);
    }
}
