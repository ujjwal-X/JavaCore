package java8.stream.w3resourse;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Addition {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(100,200,1,2,3,104);

        int sum=l.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        int max=l.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        //average of this numbers
        OptionalDouble average=l.stream().mapToInt(Integer::intValue).average();
        System.out.println(average);
    }
}
