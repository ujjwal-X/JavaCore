package java8.lambdaexpression;

import java.util.function.Predicate;
//Predicate is fi  which takes only one argument and return boolean value

public class PredicateFI {

    public static void main(String[] args) {
        Predicate<String> checkLength=str-> str.length()>5;
        System.out.println(checkLength.test("Java"));
    }
}
