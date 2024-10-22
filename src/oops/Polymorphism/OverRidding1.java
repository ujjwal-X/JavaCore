package oops.Polymorphism;
class Parent{
    void m1(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    void m1(){
        System.out.println("Child class");
    }

}
public class OverRidding1{
    public static void main(String[] args) {
        Parent p=new Parent();
        p.m1();
        Parent p1=new Child();//overRiding works at runtime so compiler will always check instance objected created at runtime
        p1.m1();
    }

}