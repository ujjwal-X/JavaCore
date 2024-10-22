package basic;

public class DigitSum {
    public static void main(String[] args) {
        int x=25;
        int sum=0;
        while (x!=0){
            int rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        System.out.println(sum);
    }
}
