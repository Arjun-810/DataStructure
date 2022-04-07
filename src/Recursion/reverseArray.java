package Recursion;

import java.util.Scanner;

public class reverseArray {
    public static void reverse(int[] arr,int i,int n) {
        if(i>n) return;
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        reverse(arr,i+1,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        reverse(arr,0,n-1);
        for (int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
