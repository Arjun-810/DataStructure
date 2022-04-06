package Recursion;

public class printNamr5 {
    static int n = 0;

    public static void printName() {
        if (n==5) return;
        System.out.println("Arjun kaushik");
        n++;
        printName();
    }
    public static void main(String[] args) {
        printName();
    }
}
