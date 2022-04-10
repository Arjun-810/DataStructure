package Recursion;

import java.util.*;

public class hashCodeP2 {
    public static int[] intersection(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

        HashSet<Integer> map = new HashSet<Integer>();
        HashSet<Integer> ans = new HashSet<Integer>();
        for (int i = 0; i < nums1.size(); i++)
            map.add(nums1.get(i));
        for (int i = 0; i < nums2.size(); i++) {
            if (map.contains(nums2.get(i))) {
                ans.add(nums2.get(i));
            }
        }
        int arr[] = new int[ans.size()];
        int i = 0;
        for (Integer m : ans) {
            arr[i++] = m;
        }
        return arr;
    }
    public static void subSequenceSum(ArrayList<ArrayList<Integer>> ans, int a[], ArrayList<Integer> temp, int k, int start) {
        if(start > a.length || k < 0)
            return ;
        if(k == 0) {
            ans.add(new ArrayList<Integer>(temp));
            return ;
        }
        else {
            for (int i = start;
                 i < a.length; i++) {
                temp.add(a[i]);
                subSequenceSum(ans, a, temp, k - a[i],i+1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void findSub(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        ArrayList<ArrayList<Integer>>ans= new ArrayList<ArrayList<Integer>>();
        subSequenceSum(ans, arr, new ArrayList<Integer>(), sum/2, 0);
        for (int i=0;i<ans.size()-1;i++){
            for (int j=i+1;j< ans.size();j++)
                if (intersection(ans.get(i),ans.get(j)).length == 0){
                    System.out.println(ans.get(i)+" " +ans.get(j));

                }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        findSub(arr,n);
    }
}
