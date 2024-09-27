package OOPS.ObjectClass.Interface;
interface Iref{
     int x=10;//private ,protected are not allowed in interface
    void modifierChecker();
//      default void  main(){//final
//        System.out.println("I am default method");
//    };
}

public class A implements Iref {
    public void modifierChecker(){

    }
}
class B extends A implements Iref { // the correct order is always write extends first and then implements we can say that
//JVM gives priority to extends more rather than implements
public void  modifierChecker(){

}

}
