package java8.splititreator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SplitIterator {
    public static void main(String[] args) {
        List<String> languageList = Arrays.asList("Java", "C", "C++", "Python", "Scala", "Kotlin");
        Spliterator<String> languageSpliterator = languageList.spliterator();
//        languageSpliterator.tryAdvance(System.out::println);
//        languageSpliterator.tryAdvance(System.out::println);
//        forEachRemaining
        languageSpliterator.forEachRemaining(System.out::println);


//        trySplit()
        Spliterator<String> lp = languageList.spliterator();
        Spliterator<String> alp = languageSpliterator.trySplit();
        System.out.println("From 1st Spliterator");
        System.out.println("------------------");
        lp.forEachRemaining(System.out::println);

        System.out.println("------------------");

        System.out.println("From 2nd Spliterator");
        System.out.println("------------------");
        alp.forEachRemaining(System.out::println);
    }
}
