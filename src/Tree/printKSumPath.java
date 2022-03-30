package Tree;

import java.util.ArrayList;

public class printKSumPath {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int k){
            data = k;
        }
    }
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void print(ArrayList<Integer> arr, int i) {
        for (int j=arr.size()-1;j>=i;j--)
            System.out.print(arr.get(j)+" ");
        System.out.println();
    }
    public static void printSum(Node root,int k) {
        if (root == null)return;
        arr.add(root.data);
        printSum(root.left,k);
        printSum(root.right,k);
        int temp = 0;
        for (int i= arr.size()-1;i>=0;i--){
                temp+=arr.get(i);
                if (temp==k) print(arr,i);
        }
        arr.remove(arr.size()-1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);
        int k = 5;
        printSum(root,k);
    }
}
