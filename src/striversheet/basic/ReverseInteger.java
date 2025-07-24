package striversheet.basic;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n!=0){
            int lastNumber=n%10;
            reverse=reverse*10+lastNumber;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
