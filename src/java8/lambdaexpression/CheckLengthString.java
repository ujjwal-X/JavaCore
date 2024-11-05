package java8.lambdaexpression;

import java.util.function.Predicate;

public class CheckLengthString {
    public static void main(String[] args) {
        String[] name={"Java","Devloper","C++","Vishal","Eshant","Karan","Shubham"};
        Predicate<String> s=str->str.length()>5;
        for (String str:name) {
            if(s.test(str)){
                System.out.println(str);
            }
        }
    }
}
