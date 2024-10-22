package stringpractice;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        String str="Java Devloper";

//     method 1=>
//        char[] c=new char[str.length()];
//        int j=0;
//        for (int i=c.length-1; i>0;i--){
//            c[i]=str.charAt(j);
//            j++;
//        }
//        for (int i=0; i<c.length;i++){
//            System.out.print(c[i]);
//        }
//        System.out.println();
//        String s1=Arrays.toString(c);
//        System.out.println(s1);
//        Method 2=>
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("using String builder => "+sb);
        StringBuffer sb1=new StringBuffer(str);
        sb1.reverse();
        System.out.println("String buffer => "+sb1);





    }
}
