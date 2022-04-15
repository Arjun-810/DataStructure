package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen {
    public static void solve(int col,List<String> board,List<List<String>> list,int n) {
        if (col == n){
            list.add(board);
            return;
        }
//        for (int row = 0;row<n;row++){
//            if (isSafe(row,col,board,n)){
//                board[row][b]
//            }
//        }
    }
//    public static List<List<Integer>> solveNQueen(int n) {
//        List<List<String>> list = new ArrayList<>();
//        List<String> board = new ArrayList<>();
//        for (int i=0;i<n;i++) board.add(".");
//        solve(0,board,list,n);
//        return list;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(solveNQueen(n));
    }
}
