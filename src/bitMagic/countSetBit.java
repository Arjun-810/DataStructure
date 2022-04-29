package bitMagic;

public class countSetBit {
    static int[] table = new int[256];
    public static void main(String[] args) {
        int res = 0,n=81;
//        while(n>0){
//            res = res+(n&1);
//            n=n>>1;
//        }
//        System.out.println(res);
//        while (n>0){
//            n = n&(n-1);
//            res++;
//        }
//        System.out.println(res);
        table[0] = 0;
        for (int i = 0; i < 256; i++)
            table[i] = (i&1) + table[i/2];
        res = table[n&0xff];
        n = n>>8;
        res = res+table[n&0xff];
        n = n>>8;
        res = res+table[n&0xff];
        n = n>>8;
        res = res+table[n&0xff];
        n = n>>8;
        System.out.println(res);

    }
}
