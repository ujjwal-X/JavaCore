package StringPractice.StringQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();



        String str1="";
        for(int i=str.length()-1; i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);
    //Using String Builder reverse an array
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
