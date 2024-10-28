package learningclassandobject.Inheritance.overridng;
class A{
    private void  test(){
        System.out.println("Private method");
    }

    final void  test2(){
        System.out.println("Final method of class A");
    }
    static void  test3(){
        System.out.println("static method Class A");
    }

}
class B extends A{



}

public class OverRidiingModifiers {
    public static void main(String[] args) {
        B b=new B();
        A a=new A();
        a.test2();
        b.test3();
        b.test2();
    }

}
