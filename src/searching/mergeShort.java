package searching;

import java.util.Scanner;

public class mergeShort {
    public static void merge(int[] arr,int start,int mid, int end) {
        int start2 = mid+1;
        if(arr[mid]<=arr[start2]) return;
        while (start<=mid && start2<= end){
            if(arr[start]<=arr[start2])start++;
            else {
                int value = arr[start2];
                int idx = start2;
                while (idx != start){
                    arr[idx] = arr[idx-1];
                    idx--;
                }
                arr[start] = value;
                start++;
                start2++;
                mid++;
            }
        }
    }
    public static void mergeShort(int[] arr, int l,int r) {
        if(l<r){
            int m = l+(r-l)/2;
            mergeShort(arr,l,m);
            mergeShort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        mergeShort(arr,0,arr.length-1);
        for (int i=0;i<n;i++)
            System.out.println(arr[i] + " ");
    }
}
