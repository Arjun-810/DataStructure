package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class allSubSequence {
    public static void printAllSubSeq(int idx, ArrayList<Integer> sub_seq,int[] arr,int n) {
        if (idx == n){
            System.out.println(sub_seq);
            return;
        }
        sub_seq.add(arr[idx]);
        printAllSubSeq(idx+1, sub_seq, arr, n);
        sub_seq.remove(sub_seq.size()-1);
        printAllSubSeq(idx+1, sub_seq, arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();
        ArrayList<Integer> sub_seq = new ArrayList<>();
        printAllSubSeq(0,sub_seq,arr,n);
    }
}
