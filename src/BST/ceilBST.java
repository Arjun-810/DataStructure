package BST;

public class ceilBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int d){
            data = d;
        }
    }

    public static int isPresent(Node root, int x, int isAva) {
        if (root == null) return isAva;
        if (root.data == x) return root.data;
        if (x<root.data){
            isAva = isPresent(root.left,x,isAva);
        }

        else{
            isAva = root.data;
            isAva = isPresent(root.right,x,isAva);
        }
        return isAva;

    }

    public static Node insert(Node root, int key) {
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
        int x = 24;
        System.out.print(isPresent(root,x,0));
    }
}
