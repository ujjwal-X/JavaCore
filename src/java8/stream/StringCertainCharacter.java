package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCertainCharacter {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Apple","Bannana","Cheery","Coconut","Kiwi","PineApple","Average","Aman");
        System.out.println(l.stream().filter(s->s.charAt(0)=='A').collect(Collectors.toList()));
        //letter starts with given charater or not
        l.stream().filter(s->s.startsWith("A")).peek(System.out::println);
        Long x=l.stream().filter(s->s.startsWith("A")).count();
        System.out.println(x);
        //convert list of string into upperCase
        l.stream().map(s->s.toUpperCase()).forEach(System.out::println);
        //concatenating  String
        String merge=l.stream().collect(Collectors.joining(","));
        System.out.println(merge);


    }
}
