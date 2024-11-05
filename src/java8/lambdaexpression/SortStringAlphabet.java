package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringAlphabet {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Python");
        a.add("Java");
        a.add("C++");
        a.add("Ruby");
        a.add("JavaScript");
        a.add("React");
        a.add("React");
        a.add("React");a.add("React");a.add("React");a.add("React");





        List<String> l=a.stream().sorted().collect(Collectors.toList());
        System.out.println(l);
        List<String> distinct=a.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(distinct);
        System.out.println(Stream.iterate(0,i->i+1).limit(30).skip(10).collect(Collectors.toList()));
        System.out.println(Stream.iterate(0,i->i+1).limit(30).max((s1,s2)->s1.compareTo(s2)));

    }
}
