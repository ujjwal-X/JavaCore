package LearningClassAndObject.Interface;
//function interface only contains one abstract method to perform lambda expression
//if you forcefully want to compiler to consider as a function interface then you have to add annotation on the top of function interface like @FunctionalInterface
//when you wrote this annotation on the top of interface block compiler forced you to write only one method inside that interface
@FunctionalInterface
interface Addition{
    void add(int a,int b);

//    void add(int a,int b,int c);
    public static final int a=10;
    public static final int b=20;
    public class zebra{};
    public  static  class A{}
    public  static class B{}
    public default void c(){}
    public default void d(){}

    private static void m3(){}
    private void m6(){};
    public abstract int hashCode();



}
//java.lang.object class methods doesnt consider as abstract methods
@FunctionalInterface
interface Subtract extends Addition{
//void subtraction();it will throw error because sub interface is implements to add interface
}
public class FunctionInterface {
    public static void main(String[] args) {

    }
}
