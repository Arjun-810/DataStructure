package bitMagic;

import java.util.Scanner;

public class missingNo {
    public static int missing(int[] arr) {
        int res1 = 0,c=1,res2 = 0;
        for (int i=0;i< arr.length;i++){
            res1 = res1^ arr[i];
        }
        for (int i = 1; i <= arr.length+1; i++) {
            res2 = res2^i;
        }
        return res1^res2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(missing(arr));
    }
}
