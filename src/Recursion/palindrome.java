package Recursion;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str,int i, int n) {
        if (i>n) return true;
        if (str.charAt(i) != str.charAt(n)) return false;
        isPalindrome(str,i+1,n-1);
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
}
