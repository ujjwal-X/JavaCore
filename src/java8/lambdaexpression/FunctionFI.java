package java8.lambdaexpression;

import java.util.function.Function;

public class FunctionFI {
    public static void main(String[] args) {
        Function<Integer,String> getInt=t->t*10+" data is multiplied by 10";
        System.out.println(getInt.apply(2));
    }
}
