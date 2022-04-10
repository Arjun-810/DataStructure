package Recursion;

import java.util.*;

public class combimationSum {
    public static void comSum(int idx, int[] can, int n, int t, List<List<Integer>> res, List<Integer> temp) {
        System.out.println(t);
        if (t == 0) {
            res.add(new ArrayList<>(temp));
            System.out.println(res);
            return;
        }
        for (int i = idx; i < can.length; i++) {
            if (i > idx && can[i] == can[i - 1]) continue;
            if (can[i] > t) break;
            temp.add(can[idx]);
            comSum(idx + 1, can, n, t - can[idx], res, temp);
            temp.remove(temp.size() - 1);
        }
    }
    public static List<List<Integer>> combSum(int[] candidates,int n,int t) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        comSum(0, candidates, n,t,res,new ArrayList<>());
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(combSum(arr,n,target));
    }
}
