package bitMagic;

import java.util.Scanner;

public class twoOddOccuring {
    public static void TwoOddOcc(int[] arr) {
        int res = 0,ls =0,res1 = 0,res2=0;
        for (int i = 0; i < arr.length; i++) res = res^arr[i];
        boolean isFin = true;
        while (isFin)
            if ((res&(1<<ls)) > 0){
                isFin = false;
                continue;
            }
        for (int i=0;i< arr.length;i++){
            if ((arr[i]>>ls & 1) == 1) res1 = res1^arr[i];
            else res2 = res2^arr[i];
        }
        System.out.println(res1+" "+res2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();
        TwoOddOcc(arr);
    }
}
