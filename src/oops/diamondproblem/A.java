package oops.diamondproblem;


//class B{
//
//    int x=10;
//
//    void doWrite(){
//        System.out.println("I am a method inside class B");
//    }
//}
//
//class C extends B{
//    int x=100;
//
//    void doWrite(){
//        System.out.println("I am a method inside class C");
//    }
//}


interface X{
    void doSomething();
    default void add(){
        System.out.println("default method of interface 1");
    }
}
interface Y{
    void doSomething();
    default void add(){
        System.out.println("default method of interface 2");
    }
}


public class A implements X,Y{
    public static void main(String[] args) {
//        A a=new A();
//        B b=new C();
//        b.doWrite();
//        a.doWrite();


    }

    @Override
    public void doSomething() {
        System.out.println("interface");
    }

    @Override
    public void add() {
        System.out.println("main method"+getClass().getName());
    }


}
