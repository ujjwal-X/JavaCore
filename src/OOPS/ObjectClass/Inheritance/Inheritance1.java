package OOPS.ObjectClass.Inheritance;
class Employee {
    int salary = 60000;
    final int x=10;
    int y=19;
    static int z;
     void m1(){
        System.out.println("m1 method");
    }
    Employee(){

    }

    protected void work(){
        System.out.println("Employee");
    }
}
class Engineer extends Employee {

    int benefits = 10000;
    void m1(){
        super.m1();

    }

}
public class Inheritance1 extends Engineer{
    public static void main(String[] args) {
        Engineer e1=new Engineer();
        Employee e2=new Employee();
        System.out.println(e1.x);
        e2.work();
        e1.m1();




        System.out.println(e1.benefits);
    }
}
