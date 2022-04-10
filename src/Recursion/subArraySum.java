package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class subArraySum {
    public static void resSubSum(int idx, int[] arr,int sum,ArrayList<Integer> res) {
        if (idx == arr.length){
            res.add(sum);
            return;
        }
        resSubSum(idx+1, arr, sum+arr[idx],res);
        resSubSum(idx+1, arr, sum,res);
    }

    public static ArrayList<Integer> subSum(int idx,int[] arr,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        resSubSum(idx, arr, sum,res);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(subSum(0,arr,0));
    }
}
