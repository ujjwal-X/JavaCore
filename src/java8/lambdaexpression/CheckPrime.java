package java8.lambdaexpression;

import java.util.function.Predicate;

public class CheckPrime {
    public static void main(String[] args) {
        Predicate<Integer> p = (a) -> {
            int z=0;
            for (int i = 2; i < a; i++) {
                if (a % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(p.test(3));

    }
}
