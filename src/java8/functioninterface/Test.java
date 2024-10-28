package java8.functioninterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
     String name;
     int empno;
    Employee(String name,int empno){
        this.name=name;
        this.empno=empno;
    }
    public Employee() {

    }


    public String toString(){
        return  name+" : "+empno;
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> e=new ArrayList<>();
        e.add(new Employee("Karan",1001));
        e.add(new Employee("Eshant",101));
        e.add(new Employee("Shubham",102));
        e.add(new Employee("Gourav",103));
//        Comparator c=(e1,e2)->e1.name>e2.name?;
//        Collections.sort(e);
//   ->   Sorting of empno ascending order

//        Comparator<Employee> c=(e1,e2)->e1.empno-e2.empno;
//        for reverse sorting order Comparator<Employee> c=(e1,e2)->e2.empno-e1.empno;
//        Collections.sort(e,c);
//   -> sorting of name
        Comparator<Employee> c=(e1,e2)->e2.name.compareTo(e1.name);
//    for ascending order    Comparator<Employee> c=(e1,e2)->e1.name.compareTo(e2.name); for descending Comparator<Employee> c=(e1,e2)->e2.name.compareTo(e1.name);
        Collections.sort(e,c);
        System.out.println(e);



    }
}
