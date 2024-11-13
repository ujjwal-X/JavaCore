package java8.methodreference;

import java.util.*;

class Person {
    public String name;

    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25)
        );


        people.sort(Comparator.comparing(Person::getAge));


        people.forEach(System.out::println);
    }
}
