package java8.lambdaexpression;

import java.util.function.BiFunction;

public class ConcatnateString {
    public static void main(String[] args) {
        BiFunction<String,String,String>s=(s1,s2)->s1+s2;
        System.out.println(s.apply("Java","Core"));
    }
}
