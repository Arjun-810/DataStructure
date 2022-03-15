package Tree;

import java.util.*;

public class levelOrderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int key) {
            data = key;
        }
    }

    public static void levelOrder(Node node) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if (node == null) return;
        q.offer(node);
        while (!q.isEmpty()){
            int levelnum = q.size();
            List<Integer> l = new LinkedList<Integer>();
            for (int i = 0; i < levelnum; i++) {
                if (q.peek().left!=null)q.offer(q.peek().left);
                if (q.peek().right!=null)q.offer(q.peek().right);
                l.add(q.poll().data);
            }
            list.add(l);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root);
    }
}
