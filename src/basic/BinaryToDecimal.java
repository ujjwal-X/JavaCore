package basic;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int x=1001;
        double answer=0;
        int power=0;
        while (x!=0){

            int rem=x%10;
            answer=answer+rem*Math.pow(2,power++);
            x=x/10;

        }
        System.out.println(answer);
    }
}
