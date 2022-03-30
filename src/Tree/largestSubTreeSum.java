package Tree;

public class largestSubTreeSum {
    static class newNode {

        int data;
        newNode left;
        newNode right;

        public newNode(int d) {
            data =d;
        }
    }
    static class INT{
        int a;
        public INT(int data){
            a = data;
        }
    }
    public static int sum(newNode root, INT sum) {
        if (root == null) return 0;
        int curr = sum(root.left,sum)+sum(root.right,sum)+root.data;
        sum.a = Math.max(sum.a,curr);
        return curr;
    }
    public static int findLargestSubtreeSum(newNode root) {
        if(root == null) return 0;
        INT max_sum = new INT(-99999);
        sum(root,max_sum);
        return max_sum.a;
    }
    public static void main(String[] args) {
        newNode root = new newNode(1);
        root.left = new newNode(-2);
        root.right = new newNode(3);
        root.left.left = new newNode(4);
        root.left.right = new newNode(5);
        root.right.left = new newNode(-6);
        root.right.right = new newNode(2);
        System.out.println(findLargestSubtreeSum(root));
    }
}
