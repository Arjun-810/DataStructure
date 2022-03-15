package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePreorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            data = val;
        }
    }

    public static void iterativePreorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root == null) return;
        stack.add(root);
        while (!stack.empty()){
            root = stack.pop();
            list.add(root.data);
            if (root.right!= null)
                stack.push(root.right);
            if (root.left!=null)
                stack.push(root.left);
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
        iterativePreorder(root);
    }
}
