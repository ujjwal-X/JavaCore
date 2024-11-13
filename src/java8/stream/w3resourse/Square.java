package java8.stream.w3resourse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Square {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(2,3,4,5,6,6,7,88,89);
        Stream<Integer> s=l.stream();
        System.out.println(l.stream().map(i->i*2).collect(Collectors.toList()));

    }
}
