package stringpractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public  static  boolean checkAnagram(String s1,String s2){
        boolean isAnagram=false;
        int counter=0;
        if(s1.length()==s2.length()){
            char[] arr=s1.toCharArray();
            char[] arr1=s2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            for(int i=0; i<arr.length;i++){
                if(arr[i]==arr1[i]){
                    counter++;
                }
            }
            if(counter==arr.length){
                isAnagram=true;
            }
            else{
                isAnagram=false;
            }

        }
        else {
            isAnagram=false;
        }
        return isAnagram;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase().replace(" ","");
        String str1=sc.nextLine().toLowerCase().replace(" ","");
        if(checkAnagram(str,str1)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}
