package OOPS.ObjectClass.Modifiers.Package1;
//if i am taking about protected within package
class B{
    protected  void m1(){
        System.out.println("m1 method is protected");
    }
}
public class ProtectedExample1 extends B {
    public static void main(String[] args) {
        B b=new B();
        b.m1();
        ProtectedExample1 p=new ProtectedExample1();
        p.m1();
        B c=new ProtectedExample1();
        c.m1();
    }

}
