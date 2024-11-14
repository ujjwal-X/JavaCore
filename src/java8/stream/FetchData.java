package java8.stream;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    static int temp;
    String name;
    String surname;
    double salary;
    String position;
    int id;

    Employee(String name, String surname, double salary, String position){
        id = ++temp;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.position=position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= "+id+'\''+
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                "}\n";
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        Employee.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //    @Override
//    public int compareTo(Object o) {
//        Employee emp = (Employee) o;
//        System.out.println("Name-->"+name+"  : "+emp.name);
//        return name.charAt(0)<emp.name.charAt(0)?-1:name.charAt(0)>emp.name.charAt(0)?1:0;
//    }
}
public class FetchData {

    public static ArrayList<Employee> al=new ArrayList<Employee>();

    public static void main(String[] args) {

        Employee e1=new Employee("Vishal","Sharma",10000,"Software Developer");
        Employee e2=new Employee("Shubham","Verma",11000,"Full Stack Developer");
        Employee e3=new Employee("Ishant","Saxena",13000,"Application Developer");
        Employee e4=new Employee("Karan","Verma",9000,"Front End developer");
        Employee e5=new Employee("Yash","Agarwal",5000,"Jr developer");

        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        System.out.println("Original "+al);
//        Sorting using id collection and stream API

        Collections.sort(al, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return  o1.id > o2.id ? -1 : o1.id < o2.id ? 1 : 0;
            }
        });
        System.out.println("Sorted "+al);

        al.stream().sorted((c1,c2)-> c1.id>c2.id?1:c1.id<c2.id?-1:0).forEach(System.out::println);

        System.out.println("stream another way to sort");
        al.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e->System.out.println(e));//sort usng id
        //        Sorting using Name collection and stream API

//        Collections.sort(al, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return  o1.name.compareTo(o2.name);
//            }
//        });
//        System.out.println(al);

       // al.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }
}
