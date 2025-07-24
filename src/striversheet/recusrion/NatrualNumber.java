package striversheet.recusrion;

import java.util.Scanner;

public class NatrualNumber {
    public static void main(String[] args) {
        //printMessage(10);
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String str= sc.nextLine();
//        printMessageNTimes(n,str);

        printNatualNumbers(10);
    }

    private static void printNatualNumbers(int i) {
        if(i==0)return;
        printNatualNumbers(i-1);
        System.out.println(i);
    }

    private static void printMessageNTimes(int n, String str) {
        if(n<0){
            return;
        }
        System.out.println(str);
        printMessageNTimes(n-1,str);
    }



    private static void printMessage(int n) {
        if(n==0){
            return;
        }
        printMessage(n-1);
        System.out.println("helloWorld -> "+n);
    }

}
