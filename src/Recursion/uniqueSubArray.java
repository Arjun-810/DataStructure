package Recursion;

import java.util.*;

public class uniqueSubArray {
    public static void uniqueSubArr(int idx,int[] arr,List<List<Integer>> set,List<Integer> list) {
        if (idx == arr.length){
            set.add(list);
            return;
        }
        uniqueSubArr(idx + 1, arr, set, new ArrayList<>(list));
        list.add(arr[idx]);
        uniqueSubArr(idx+1, arr, set, new ArrayList<>(list));
    }
    public static List<List<Integer>> subArray(int[] arr) {
        List<List<Integer>> set  = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        uniqueSubArr(0, arr, set,l);
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(subArray(arr));
    }
}
