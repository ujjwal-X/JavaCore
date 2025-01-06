package java8.realworldquestion;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.ArrayList;


public class EmployeeList {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 3122500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


//        Map<String, Double> avgAge = employeeList.stream().filter(e->e.gender.equals("Male"))
//                .collect(Collectors.groupingBy(Employee::getName,Collectors.averagingInt(Employee::getAge)));
//        Double emp = employeeList.stream().filter(e->e.gender.equals("Male"))
//                .collect(Collectors.averagingInt(Employee::getAge));
//        System.out.println(emp);



        //How many male and female employees are there in the organization?
        long female=employeeList.stream().filter(i->i.gender.equalsIgnoreCase("Female")).count();
        long male=employeeList.stream().filter(i->i.gender.equalsIgnoreCase("Male")).count();
//        System.out.println("Total number of Female = "+female+"Total number of Male = "+male);



        // Print the name of all departments in the organization?

        String str=employeeList.stream().map(Employee::getDepartment).collect(Collectors.joining(" , "));
//        System.out.println(str);



        //What is the average age of male and female employees?

     double averageAgeMale=employeeList.stream().filter(i->i.gender.equalsIgnoreCase("male")).collect(Collectors.averagingInt(Employee::getAge));
//        System.out.println(averageAgeMale);

        double averageAgeFemale=employeeList.stream().filter(i->i.gender.equalsIgnoreCase("Female")).collect(Collectors.averagingInt(Employee::getAge));
//        System.out.println(averageAgeFemale);




//Get the details of highest paid employee in the organization?

      Optional<Double> num = employeeList.stream().map(i->i.salary).sorted(Comparator.reverseOrder()).findFirst();
//        System.out.println(num.get());




//        Get the names of all employees who have joined after 2015?

        List<String> names= employeeList.stream().filter(i->i.yearOfJoining>=2015).map(Employee::getName).collect(Collectors.toList());
//        System.out.println(names);


//        Count the number of employees in each department?
        Map<String,Long> grouping=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(grouping);



//         What is the average salary of each department?
        Map<String,Double> groupingSalary= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(groupingSalary);

//        Get the details of youngest male employee in the product development department?

        Optional<Employee> min=employeeList.stream().max(Comparator.comparing(Employee::getYearOfJoining));
//        System.out.println(min);

//       double d= employeeList.stream().map(employee -> employee.salary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//       employeeList.stream().filter(i->i.salary==d).toList().forEach(e-> System.out.println(e.getName()+" " +e.salary));
        Optional<Double> d= employeeList.stream().map(employee -> employee.salary).sorted(Comparator.reverseOrder()).skip(1).findFirst();
//        System.out.println(d);

//        employeeList.stream().filter(i -> i.salary==(employeeList.stream().map(e-> e.salary).sorted(Comparator.reverseOrder()).skip(1).findFirst().get())).toList().forEach(p-> System.out.println(p.getName()+" "+p.salary));






//      Write a Java Stream expression to filter and list all employees working in the "Product Development" department.
//        employeeList.stream().filter(e->e.getDepartment().equalsIgnoreCase("Product Development")).forEach(System.out::println);


//      Use Stream API to compute the average age of all employees in the employeeList.

        Double i=employeeList.stream().map(e->e.getAge()).collect(Collectors.averagingInt(Integer::intValue));
//        System.out.println(i);


//      Find the youngest employee in the "Sales And Marketing" department.
        Optional<Employee> youngestemp=employeeList.stream()
                        .filter(e->e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
                        .min(Comparator.comparingInt(Employee::getAge));
//        System.out.println(youngestemp.get().getName()+" "+youngestemp.get().getAge());



      // count of employee in each department
        Map<String,Long> emp=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(emp);


        //separate with department in asscendign order  GW MUST BE SAMLLER THAN 25
//        Map<String,Long> count=employeeList.stream().
//                filter(employee -> employee.getAge()<50)
//                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        employeeList.stream()
                .filter(employee -> employee.getAge() < 50)
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()))
                .entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(dept->{
                    System.out.println("dept " + dept.getKey());
                    dept.getValue()
                            .forEach(System.out::println);
                });








    }






}
