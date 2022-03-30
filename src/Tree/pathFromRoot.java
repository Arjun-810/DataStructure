package Tree;

import java.util.ArrayList;

public class pathFromRoot {
    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }

    public static boolean pathFound(Node root,ArrayList<Integer> arr, int x) {
        if (root == null) return false;
        arr.add(root.data);
        if (root.data == x)return true;
        if (pathFound(root.left,arr,x)||pathFound(root.right,arr,x))return true;
        arr.remove(arr.size()-1);
        return false;
    }
    public static void printPath(Node root,int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(pathFound(root,arr,x)){
            for (int i=0;i<arr.size();i++)
                System.out.print(arr.get(i)+" ");
        }
        else System.out.println("No path found");
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int x=5;
        printPath(root, x);
    }
}
