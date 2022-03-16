package Tree;

import java.util.*;

public class heightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            data = val;
        }
    }

    public static int height(Node root) {
//        if (root == null) return;
//        Queue<Node> q = new LinkedList<>();
//        int h = 0;
//        q.offer(root);
//        while (!q.isEmpty()){
//            int level = q.size();
//            for (int i = 0; i < level; i++) {
//                if (q.peek().right!= null) q.offer(q.peek().right);
//                if (q.peek().left != null) q.offer(q.peek().left);
//                q.poll();
//            }
//            h++;
//        }
//        System.out.println("Height of binary tree = " + h);
        if (root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        return 1+Math.max(l,r);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.left = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8);
        System.out.println(height(root));
    }
}
