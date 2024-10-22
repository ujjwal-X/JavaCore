package oops.Modifiers.Package2;
import oops.Modifiers.Package1.A;
public class B {
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        // A Class is public that's why we can access it outside the class
//        a.m2(); default cant be accessed outside the package it can be only accessed within the same package
    }
}
