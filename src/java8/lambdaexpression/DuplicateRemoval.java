package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,20,10,30,40,1,2,3,2,1,5);
        l.stream().distinct().forEach(System.out::println);
    }
}
