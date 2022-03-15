package Tree;

public class preOrderTreversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int k){
            data = k;
        }
    }

    public static void preorder(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Pree order taversal = ");
        preorder(root);

    }
}
