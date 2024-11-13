package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamSelection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.add("David");

        names.add("Brijesh");

//      Filter method
        System.out.println("=========Filter Method==============");

        names.stream().filter(i->i.length()>5).forEach(System.out::println);

//        Distinct method
        System.out.println("=========Distinct Method==============");

        names.stream().distinct().forEach(System.out::println);

//        Limit() method
        System.out.println("=========Limit Method==============");

        names.stream().limit(5).forEach(System.out::println);

//        Skip() Method
        System.out.println("=========Skip Method==============");

        names.stream().skip(11).forEach(System.out::println);

//       Mapping()
        System.out.println("=========Map Method==============");

        names.stream().map(String::length).forEach(System.out::println);

//        Sorting method
        System.out.println("=========Sorting Method==============");

        names.stream().sorted().forEach(System.out::println);

//        Sorted(Comparator) Sorting according to supplied Comparator ascending order -> (c1,c2)->c1.charAt(0)-c2.charAt(0)     ascending
        System.out.println("=========Comparator Method==============");

        names.stream().sorted((c1,c2)->c2.charAt(0)-c1.charAt(0)).forEach(System.out::println);

//        reduce() : Produces a single value
        System.out.println("=========reduce Method==============");

        System.out.println(names.stream().distinct().sorted().reduce("",(s1,s2)->s1+ " "+s2));

//        System.out.println(names.stream().distinct().sorted().reduce((s1,s2)->s1+ " "+s2));//it is not compulsory to set initial value

//        Max()
        System.out.println("=========Max Method==============");

        System.out.println(names.stream().max((s1,s2)->s1.length()-s2.length()));

//        min()
        System.out.println("=========min Method==============");

        System.out.println(names.stream().min((s1,s2)->s1.length()-s2.length()));

//        Collect()
        System.out.println("=========Collect Method==============");
        System.out.println(names.stream().distinct().collect(Collectors.toList()));
        System.out.println(names.stream().distinct().collect(Collectors.toSet()));
//        System.out.println(names.stream().distinct().collect(Collectors.toMap()));//doubt
        System.out.println(names.stream().distinct().collect(Collectors.toSet()));
//        Finding And Matching Operations anyMatch() : Any one element matches it return predicate
//        Returns true if any one element of a stream matches with given predicate. This method may not evaluate all the elements of a stream. Even if the first element matches with given predicate, it ends the operation.
        System.out.println("==========anyMatch()==========");
        if(names.stream().anyMatch((String name) -> name.equals("Johnson")))
        {
            System.out.println("Yes... There is a name exist with 5 letters");
        }
    }
}
