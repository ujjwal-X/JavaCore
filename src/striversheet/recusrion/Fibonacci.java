package striversheet.recusrion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int result=NthFibonacci(n);
        System.out.println(result);
    }

    private static int NthFibonacci(int n) {
        if(n==0)return n;
        if(n==1)return n;

        return NthFibonacci(n-1)+NthFibonacci(n-2);
    }
}
