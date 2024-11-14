package java8.splititreator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class CreateStringJoiner {
    public static void main(String[] args) {
        StringJoiner s=new StringJoiner(" | ");
        s.add("Facebook");

        s.add("Twitter");

        s.add("YouTube");

        s.add("WhatsApp");

        s.add("LinkedIn");

        System.out.println(s);


        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");

        stringJoiner.add("Facebook");

        stringJoiner.add("Twitter");

        stringJoiner.add("YouTube");

        stringJoiner.add("WhatsApp");

        stringJoiner.add("LinkedIn");

        System.out.println(stringJoiner);




//        Java 8 String.join() Method :


        String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        System.out.println(joinedString);


//        Collector
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String js = listOfStrings.stream().collect(Collectors.joining());

        System.out.println(js);

        String js1 = listOfStrings.stream().collect(Collectors.joining("|"));

        System.out.println(js1);

        String js2 = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        System.out.println(js2);
    }
}
