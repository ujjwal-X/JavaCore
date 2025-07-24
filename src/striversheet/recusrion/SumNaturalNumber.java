package striversheet.recusrion;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int n=5;
        int sum=sumOfNaturalNumber(n);
        System.out.println(sum);
    }

    private static int sumOfNaturalNumber(int n) {


        if(n==0)return n;

        return n+sumOfNaturalNumber(n-1);
    }
}
