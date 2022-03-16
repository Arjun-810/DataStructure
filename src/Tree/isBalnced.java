package Tree;

public class isBalnced {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            data = val;
        }
    }

    public static boolean isBalencedBinaryTree(Node root) {
        return height(root)!=-1;
    }
    public static int height(Node root) {
        if (root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        if (Math.abs(l-r)>1) return -1;
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
        System.out.println("Is tree is balenced = " + isBalencedBinaryTree(root));
    }
}
