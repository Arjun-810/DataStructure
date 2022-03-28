package Tree;

public class diagonal {
    public static void main(String[] args) {
        int c=0;
        for(int n=1;n<=10;n++)
        for(int i=1;i<=n/2;i++){
            if(n%(n-i)==0)
                c++;
        }
        System.out.println(c);
    }
}
