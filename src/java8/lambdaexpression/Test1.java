package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {
     String name;
     int empno;
    Employee1(String name,int empno){
        this.name=name;
        this.empno=empno;
    }
    public Employee1() {

    }


    public String toString(){
        return  name+" : "+empno;
    }
}

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Employee1> e=new ArrayList<>();
        e.add(new Employee1("Karan",1001));
        e.add(new Employee1("Eshant",101));
        e.add(new Employee1("Shubham",102));
        e.add(new Employee1("Gourav",103));
//        Comparator c=(e1,e2)->e1.name>e2.name?;
//        Collections.sort(e);
//   ->   Sorting of empno ascending order

//        Comparator<Employee> c=(e1,e2)->e1.empno-e2.empno;
//        for reverse sorting order Comparator<Employee> c=(e1,e2)->e2.empno-e1.empno;
//        Collections.sort(e,c);
//   -> sorting of name
        Comparator<Employee1> c=(e1,e2)->e2.name.compareTo(e1.name);
//    for ascending order    Comparator<Employee> c=(e1,e2)->e1.name.compareTo(e2.name); for descending Comparator<Employee> c=(e1,e2)->e2.name.compareTo(e1.name);
        Collections.sort(e,c);
        System.out.println(e);



    }
}
