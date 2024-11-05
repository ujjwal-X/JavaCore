package java8.lambdaexpression.predefine;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student1
{
    int id;

    String name;

    double percentage;

    String specialization;

    public Student1(int id, String name, double percentage, String specialization)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }
}

public class Student {
    public static void main(String[] args) {

        List<Student1> listOfStudents = new ArrayList<Student1>();

        listOfStudents.add(new Student1(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student1(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student1(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student1(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new Student1(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new Student1(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new Student1(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new Student1(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new Student1(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new Student1(101010, "Chris", 89.8, "Computers"));

        System.out.println(listOfStudents);

//
// Imagine an operation where you want only a list of “Mathematics” students from the above listOfStudents. Let’s see how to do it using Predicate.
        List<Student1> filterStudent = new ArrayList<Student1>();
        Predicate<Student1>filtered=(s)->s.specialization.equals("Mathematics");
        for (Student1 s:listOfStudents) {
            if(filtered.test(s)){
                filterStudent.add(s);
            }
        }
        System.out.println(filterStudent);
//Consumer represents an operation which takes an argument and returns nothing. Use this functional interface If you want to compose a lambda expression which performs some operations on an object.
//For example, displaying all students with their percentage. Lambda expression implementing Consumer : Displaying all students with their percentage
        Consumer<Student1> c=(s)-> System.out.println(s.name+" "+s.specialization);
        for (Student1 s:listOfStudents){
            c.accept(s);
        }
//Function represents an operation which takes an argument of type T and returns a result of type R. Use this functional interface if you want to extract some data from an existing data.
//For example, extracting only the names from listOfStudents.
//Lambda expression implementing Function : Extracting only the names of all students
        System.out.println("=========only names=======");
        Function<Student1,String> names= Student1::getName;
        for (Student1 s:listOfStudents) {
            System.out.println(names.apply(s));
        }
//Supplier represents an operation which takes no argument and returns the results of type R. Use this functional interface when you want to create new objects.
//Lambda expression implementing Supplier : Creating a new Student
        Supplier<Student1> s=()->new Student1(111111, "New Student", 92.9, "Java 8");
        listOfStudents.add(s.get());
        System.out.println(listOfStudents);
    }
}
