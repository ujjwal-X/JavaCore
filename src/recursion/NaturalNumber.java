package recursion;



public class NaturalNumber {

    static int reverseNaturalNumber(int n) {
        if(n==1) return 1;
        System.out.println(n);
        return reverseNaturalNumber(n-1);
    }
    public static void main(String[] args) {
        System.out.println(reverseNaturalNumber(5));
    }
}
