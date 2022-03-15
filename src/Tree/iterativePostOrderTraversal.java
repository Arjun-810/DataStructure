package Tree;

import java.util.Stack;

public class iterativePostOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            data = val;
        }
    }

    public static void iterativePostOrder(Node node) {
        if (node == null) return;
        Stack<Integer> stack2 = new Stack<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            node = stack.pop();
            stack2.push(node.data);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        System.out.println(stack2);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        iterativePostOrder(root);
    }
}
