package bitMagic;

import java.util.Scanner;

public class oddOccurance {
    public static void oddOcc(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) count++;
//            }
//            if (count %2 != 0) System.out.println(arr[i]);
//        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res^arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();
        oddOcc(arr);
    }
}
