package oops.Interface;

interface Z{
    default void m1(){
        System.out.println("Interface Z method");
    }
}
interface X{
    default void m1(){
        System.out.println("Interface X method");
    }
}

public class InterfaceAmbiguty implements X,Z {
    public static void main(String[] args) {
        Z z=new InterfaceAmbiguty();
        z.m1();
    }

    @Override
    public void m1() {
        Z.super.m1();
    }
}
