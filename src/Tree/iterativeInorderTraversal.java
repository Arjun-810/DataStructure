package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativeInorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            data = val;
        }
    }

    public static void iterativeInorder(Node root) {
        if (root == null) return;
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (true){
            if (node != null) {
                stack.push(node);
                node = node.left;
            }else {
                if (stack.isEmpty())
                    break;
                node = stack.pop();
                list.add(node.data);
                node = node.right;
            }
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
        iterativeInorder(root);
    }
}
