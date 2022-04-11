package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class purmutation2 {
    public static void perm(int idx,int[] arr,List<List<Integer>> list) {
        if (idx == arr.length){
            List<Integer> temp = new ArrayList<>();
            for (int i=0;i<arr.length;i++) temp.add(arr[i]);
            list.add(temp);
            return;
        }
        for (int i=idx;i<arr.length;i++){
            swap(i,idx,arr);
            perm(idx+1, arr, list);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i,int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        perm(0,arr,list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(permutation(arr));
    }
}
