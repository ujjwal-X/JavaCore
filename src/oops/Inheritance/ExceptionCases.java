package oops.Inheritance;

class M1{
    public static void m1(){
        System.out.println("parent m1 method");
    }
    public void m2(int i){
        System.out.println(i+"parent method");
    }
}
class M2 extends M1{
    public static void m1(){
        System.out.println("Child m2 method");
    }
    public void m2(int... i){
        System.out.println(i+"Child method");
    }

    public void anotherMehtod(){
        System.out.println("hello world");
    }
}
public class ExceptionCases {
    public static void main(String[] args) {
        M2 m=new M2();
        m.m2(1,2,3);
    }
}
