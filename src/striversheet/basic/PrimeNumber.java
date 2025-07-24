package striversheet.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=4;
        boolean flag=primeOrNot(n);
        if(flag)
            System.out.println("is prime number");
        else
        System.out.println("not prime number");
    }

    private static boolean primeOrNot(int n) {
        int count=0;
        for (int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0)
            return true;
        else
            return false;
    }
}
