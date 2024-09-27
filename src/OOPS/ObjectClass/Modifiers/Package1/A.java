package OOPS.ObjectClass.Modifiers.Package1;

public class A {
    public void m1(){
        System.out.println("A class method");
    }
    void m2(){
        System.out.println("A class m2 default method");
    }
    private void  m3(){
        System.out.println("A class m3 private method ");
    }

    public static void main(String[] args) {
        A a=new A();
        a.m3();
    }
}
