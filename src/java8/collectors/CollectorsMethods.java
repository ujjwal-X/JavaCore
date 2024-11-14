package java8.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student
{
    String name;

    int id;

    String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String getSubject()
    {
        return subject;
    }

    public double getPercentage()
    {
        return percentage;
    }

    @Override
    public String toString()
    {
        return name+"-"+id+"-"+subject+"-"+percentage;
    }
}

public class CollectorsMethods {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));
        //Operation 1 => Collecting top 3 performing students into List
        List <Student> top3=studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(top3);
        //Operation 2 =>   Collecting subjects offered into Set.
        Set<String> totalSubjects= studentList.stream().map(i->i.subject).collect(Collectors.toSet());
        System.out.println(totalSubjects);
//       Operation 3 => Collecting name and percentage of each student into a Map
        Map<String,Double> data=studentList.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
        System.out.println(data);
//        Operation 4=>Collecting first 3 students into LinkedList
        LinkedList<Student> first3=studentList.stream().limit(3).collect(Collectors.toCollection(LinkedList::new));
//      Operation 5 => Collecting the names of all students joined as a string
        List <String> allNames=studentList.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(allNames);
//        Counting number of students.
        Long totalNumber=studentList.stream().collect(Collectors.counting());
        System.out.println(totalNumber);
//        Collecting highest percentage.
        Optional<Double> percentage=studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(percentage);
    }
}
