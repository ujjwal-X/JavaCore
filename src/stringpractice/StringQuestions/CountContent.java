package stringpractice.StringQuestions;

import java.util.Arrays;

//count total number of char number and special characters
public class CountContent {
    public static void main(String[] args) {
        String str="za kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        
        counter(str);
;
    }
    public static void counter(String str){
        int letter = 0;
        int space = 0;
        int num = 0;
        int special = 0;
        for (int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num++;
            } else if (Character.isLetter(str.charAt(i))) {
                letter++;
            } else if (Character.isSpaceChar(str.charAt(i))) {
                space++;
            } else {
                special++;
            }
        }
        System.out.println("Digit => "+num+" Letter => "+letter+" space => "+space+" specialCharater => "+special);
    }
}
