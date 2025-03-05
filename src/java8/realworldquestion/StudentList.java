package java8.realworldquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {

    public static void main(String[] args) {

                List<Student> students = new ArrayList<>();

                students.add(new Student(1, "Alice Johnson", 101, "10th Grade"));
                students.add(new Student(2, "Bob Smith", 102, "10th Grade"));
                students.add(new Student(3, "Charlie Brown", 103, "10th Grade"));
                students.add(new Student(4, "Diana Prince", 104, "10th Grade"));
                students.add(new Student(5, "Hannah Davis", 105, "10th Grade"));
                students.add(new Student(6, "Alice Johnson", 106, "10th Grade"));
                students.add(new Student(7, "George Miller", 107, "10th Grade"));
                students.add(new Student(8, "Hannah Davis", 108, "10th Grade"));
                students.add(new Student(9, "Ian Wright", 109, "10th Grade"));
                students.add(new Student(10, "Julia Roberts", 110, "10th Grade"));


                Map<String,Long> duplicate=students.stream().collect(Collectors.groupingBy(student -> student.getName(),Collectors.counting()));
//        System.out.println(duplicate);
        List<String> duplicateNames = duplicate.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        students.stream()
                .filter(student -> duplicateNames.contains(student.getName()))
                .forEach(System.out::println);


//        System.out.println(students.stream().collect(Collectors.groupingBy(Student::getClassName, Collectors.counting())));


        }


    }
