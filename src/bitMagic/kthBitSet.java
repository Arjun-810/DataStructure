package bitMagic;

public class kthBitSet {
    public static void main(String[] args) {
        int x = 0;
        int k = 3;
//        if ((x&(int)Math.pow(2,k-1))>0) System.out.println("Yes");
//        else System.out.println("No`");
//        if ((x&(1<<(k-1))) > 0) System.out.println("Yes");
//        else System.out.println("No");
        if (((x>>(k-1)) &1) == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
