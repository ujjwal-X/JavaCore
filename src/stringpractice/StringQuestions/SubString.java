package stringpractice.StringQuestions;
import java.util.ArrayList;

public class SubString {
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList al=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {//A
            String str1 = new String();
            for (int j = i; j <str.length(); j++) {// A,AB,ABC
                str1 = str1 + str.charAt(j);
                al.add(str1);

            }
        }
        System.out.println(al);

    }
}
