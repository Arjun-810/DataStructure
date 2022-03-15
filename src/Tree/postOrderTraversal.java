package Tree;

public class postOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int k){
            data = k;
        }
    }

    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Pree order taversal = ");
        postorder(root);

    }
}
