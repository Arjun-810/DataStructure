package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class subSequencesSumK {
    public static void printSubSeqSumIsK(int idx,ArrayList<Integer> s,int[] arr, int n,int k,int sum) {
        if (idx == k){
            if (sum == k) System.out.println(s);
            return;
        }

        s.add(arr[idx]);
        sum+=arr[idx];
        printSubSeqSumIsK(idx+1, s, arr, n, k,sum);
        sum-=  s.get(s.size()-1);
        s.remove(s.size()-1);
        printSubSeqSumIsK(idx+1, s, arr, n, k,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> s = new ArrayList<>();
        printSubSeqSumIsK(0,s,arr,n,k,0);
    }
}
