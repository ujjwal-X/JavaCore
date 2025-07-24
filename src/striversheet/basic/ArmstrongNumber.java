package striversheet.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153,ans=0;
        int original=n;
        int digit=countDigit(n);
        while(n!=0){
            int num=n%10;
            ans=ans+(int)Math.pow(num,digit);
            n=n/10;
            num=0;
        }

        System.out.println(original);
        if(original==ans){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number not is armstrong");
        }
    }
    public static int countDigit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }

        return count;
    }
}
