package searching;

import java.util.Scanner;

public class searchingWithAdjecentelemntdiffferbyK {
    public static int search(int[] arr,int k, int x) {
        int i=0;
        while (i<arr.length){
            if (arr[i] == x)return i;
            i=i+Math.max(1,Math.abs(arr[i]-x)/k);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(search(arr,k,x));
    }
}
