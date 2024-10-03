package LearningClassAndObject.ObjectClassMethods;

import com.sun.jdi.connect.spi.Connection;

import java.lang.reflect.Method;
import java.sql.DriverManager;

class  Test{
public  void maths(){

}
}

public class GetClass {
    public static void main(String[] args) {
        Object o=new Test();
        System.out.println(o.getClass());
        System.out.println(o.getClass().getName());


//        int count =0;
//        Object o=new String("dj");
//        Class x=o.getClass();
//        System.out.println("Fully name"+x.getName());
//
//        Method[] m= x.getDeclaredMethods();
//        for (Method m1:m) {
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println(count);
    }
}
