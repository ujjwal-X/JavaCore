package oops.Polymorphism;
class A{
    private void m1(){
        System.out.println("m1 private method");
    }
    final  void m2(){
        System.out.println("Final method m2");
    }//final method cannot be override
}
class B extends A{

}

public class OverRidiingcase2 {
}
