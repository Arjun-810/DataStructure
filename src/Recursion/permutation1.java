package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation1 {
    public static void perm(int[] arr,List<List<Integer>> list,List<Integer> temp,boolean[] bool) {
        if (temp.size() == arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i< arr.length;i++){
            if (!bool[i]){
                bool[i] = true;
                temp.add(arr[i]);
                perm(arr, list, temp, bool);
                bool[i] = false;
                temp.remove(temp.size()-1);
            }
        }
    }
    public static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] bool = new boolean[arr.length];
        perm(arr,list,temp,bool);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(permutation(arr));
    }
}
