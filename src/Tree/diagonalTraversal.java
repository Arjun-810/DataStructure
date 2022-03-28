package Tree;

import java.util.ArrayList;
import java.util.TreeMap;

public class diagonalTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            data = d;
            left = null;
            right  = null;
        }
    }

    public static void diagonalTraversal(Node root, int s,TreeMap<Integer, ArrayList<Integer>> map) {
        if (root == null) return;
        ArrayList<Integer> arr = map.get(s);
        if (arr == null){
            arr = new ArrayList<>();
            arr.add(root.data);
        }else
            arr.add(root.data);
        map.put(s,arr);
        diagonalTraversal(root.left,s+1,map);
        diagonalTraversal(root.right,s,map);
    }
    public static void diagonalPrint(Node root) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        diagonalTraversal(root,0,map);
        System.out.println("Diagonal Traversal: ");
        for (int i=0;i<map.size();i++){
            for (int j=0;j<map.get(i).size();j++)
                System.out.print(map.get(i).get(j)+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);

        diagonalPrint(root);
    }
}
