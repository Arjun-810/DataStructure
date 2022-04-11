package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class uniqueSubSet2 {
    public static void uniqSubset(int idx,int[] arr,ArrayList<Integer> temp, List<List<Integer>> list) {
        list.add(new ArrayList<>(temp));
        for (int i=idx;i<arr.length;i++){
            if (i != idx && arr[i] == arr[i-1])continue;
            temp.add(arr[i]);
            uniqSubset(idx+1, arr, temp, list);
            temp.remove(temp.size()-1);
        }
    }
    public static List<List<Integer>> subset(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        uniqSubset(0,arr,new ArrayList<>(), list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println(subset(arr));
    }
}
