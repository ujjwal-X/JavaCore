package java8.functioninterface;

import java8.lambdaexpression.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp{
    String name;
    int salary;
    Emp(String name,int salary){
        this.name=name;
        this.salary=salary;
    }

}

public class EmployeeSalary {
    public static void main(String[] args) {
        ArrayList<Emp> a=new ArrayList<>();
        a.add(new Emp("Ishant",10000));
        a.add(new Emp("Karan",8000));
        a.add(new Emp("Shubham",9000));
        a.add(new Emp("Vishal",300));
        Predicate<Emp> p=emp -> emp.salary>5000;
        for (Emp pd:a) {
            if(p.test(pd)){
                System.out.println(pd.name);
            }
        }

    }

}
