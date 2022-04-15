package BST;

public class insertionBst {
    static class Node{
        int data;
        Node left,right;
        public Node(int d){
            data = d;
        }
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.printf(root.data+" ");
        inorderTraversal(root.right);
    }

    public static Node insert(Node root,int key) {
        if (root == null)
            return new Node(key);
        if (key<root.data) root.left = insert(root.left,key);
        else root.right = insert(root.right,key);
        return root;
    }
    public static Node constructBst(int[] keys) {
        Node root = null;
        for (int k: keys) root = insert(root,k);
        return root;
    }
    public static void main(String[] args) {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Node root = constructBst(keys);
        inorderTraversal(root);

    }
}
