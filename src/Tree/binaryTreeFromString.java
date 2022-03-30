package Tree;

import java.util.Stack;

public class binaryTreeFromString {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int d) {
            data = d;
        }
    }

    public static void printPreOrder(Node root) {
        if (root == null) return;
        System.out.print    (root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static int findIndex(String str, int s,int e) {
        if(s>e) return -1;
        Stack<Character> stack = new Stack<>();
        for (int i=s;i<e;i++){
            if (str.charAt(i) == '(')
                stack.push('(');
            else if (str.charAt(i) == ')')
                if (stack.peek() == '(')
                    stack.pop();
            if (stack.isEmpty()) return i;
        }
        return -1;
    }
    public static Node constructTree(String str, int i,int e) {
        if (i>e) return null;
        Node root = new Node(str.charAt(i)-'0');
        int index = -1;
        if (i+1<=e && str.charAt(i+1) == '(' )
            index = findIndex(str,i+1,e);
        if (index != -1){
            root.left = constructTree(str,i+2,index-1);
            root.right = constructTree(str,index+2,e-1);
        }
        return root;
    }
    public static void main(String[] args) {
        String str = "4(2(3)(1))(6(5))";
        Node root = constructTree(str,0,str.length());
        printPreOrder(root);
    }
}
