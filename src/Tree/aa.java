package Tree;

import java.util.ArrayList;
import java.util.Arrays;
    import java.util.Scanner;

public class aa {
    public static int solve(char[][] arr, int n) {
        int[] s = new int[4];
        int c1 = 0;
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                if (arr[i][j]=='I')
                    c1++;
        s[0] = c1;
        c1=0;
        for (int i=0;i<n;i++)
            for (int j=n;j<2*n;j++)
                if (arr[i][j]=='I')
                    c1++;
        s[1] = c1;
        c1 = 0;
        for (int i=n;i<2*n;i++)
            for (int j=0;j<n;j++)
                if (arr[i][j]=='I')
                    c1++;
        s[2] = c1;
        c1 = 0;
        for (int i=n;i<2*n;i++)
            for (int j=n;j<2*n;j++)
                if (arr[i][j]=='I')
                    c1++;
        s[3] = c1;
        int x = Math.abs(s[0]-s[3])+Math.abs(s[1]-s[2]);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] arr = new char[2*n][2*n];
        for (int i=0;i<2*n;i++)
            for (int j=0;j<2*n;j++)
                arr[i][j] = sc.next().charAt(0);
        System.out.println(solve(arr,n));

    }
}
