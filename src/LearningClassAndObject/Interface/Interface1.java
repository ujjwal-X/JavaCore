package LearningClassAndObject.Interface;
interface Inref{
    public void m1();

    default void interfaceFunction(){
        System.out.println("i am interface default function");
    }
}
class ServiceProvider implements Inref{
    //if we didnt overRide Inref interface
    // all methods in service provider using
    // implements  then we have to define
    // this service provider class abstract class
    @Override
     public void m1() {

    }
}
public class Interface1  {
//if we extends a abstract class which implements by interface Inref and if there is any method is missing then it will throw error
//
public static void main(String[] args) {
    int x;
    ServiceProvider sp=new ServiceProvider();
    sp.interfaceFunction();
}
}


