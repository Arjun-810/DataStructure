package BST;

import java.util.Scanner;

public class humanVsCom {
    public static void myfun(int n) {
        if (n == 0){
            return;
        }

        myfun(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        myfun(17);
    }
}
