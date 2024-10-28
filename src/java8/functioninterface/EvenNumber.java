package java8.functioninterface;

import java.util.function.Predicate;

public class EvenNumber {
    public static void main(String[] args) {
        Predicate<Integer> p=(Integer i)->{ return i%2==0;};
        System.out.println(p.test(10));
    }
}
