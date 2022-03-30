package Tree;

import java.util.ArrayList;

public class findLowestCommonAnsestor {
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    public static boolean path(Node root,int a,ArrayList<Integer> arr) {
        if (root == null) return false;
        arr.add(root.data);
        if (root.data == a) return true;
        if (path(root.left,a,arr)||path(root.right,a,arr)) return true;
        arr.remove(arr.size()-1);
        return false;
    }
    public static void findPath(Node root,int a,ArrayList<Integer> arr) {
        if (root == null) return;
        path(root,a,arr);
    }
    public static int findLCA (Node root,int a,int b) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        findPath(root,a,arr1);
        findPath(root,b,arr2);
        for (int i=0;i<arr1.size();i++){
            if (arr1.get(i) != arr2.get(i))
                return arr1.get(i-1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + findLCA(root,4,5));
    }
}
