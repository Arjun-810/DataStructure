package Tree;

import java.util.*;

public class preOrderTreversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int k){
            data = k;
        }
    }

    static Vector<Integer> arr = new Vector<Integer>();

    public static void preorder(Node node) {
        if (node == null) return;
        arr.add(node.data);
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
        System.out.println(arr);
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
        System.out.println("Pree order taversal = ");
        preorder(root);

    }
}
