package striversheet.recusrion;

public class Factorial {
    public static void main(String[] args) {
        int n=5;

        int fact= factorialofN(n);
        System.out.println(fact);
    }

    private static int factorialofN(int n) {
        if(n==1)return n;
        return n*factorialofN(n-1);
    }
}
