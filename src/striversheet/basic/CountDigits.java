package striversheet.basic;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        //Method 1
        String str=Integer.toString(n);
        System.out.println(str.length());
        //Method 2
        while(n!=0){
            count++;
            n=n/10;
        }

        System.out.println(count);

    }



}
