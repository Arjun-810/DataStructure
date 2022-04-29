package bitMagic;

public class isPowOf2 {
    public static boolean isPow2(int x) {
        if (x == 0) return false;
//        while (x != 1){
//            if ((x & 1) == 1) return false;
//            x=x/2;
//        }
//        return true;
        return  (x&(x-1)) ==0;
    }
    public static void main(String[] args) {
        int x = 48;
        System.out.println(isPow2(x));
    }
}
