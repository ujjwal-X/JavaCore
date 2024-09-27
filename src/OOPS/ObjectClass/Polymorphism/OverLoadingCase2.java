package OOPS.ObjectClass.Polymorphism;
class Test{
    public void m1(Object o){
        System.out.println("object Version");
    }
    public void m1(String version){
            System.out.println("no args");
    }
    public void m2(float f,int i){
        System.out.println("int float");
    }
    public void m2(int i,float f){
        System.out.println("int float");
    }
}
public class OverLoadingCase2 {
    public static void main(String[] args) {
Test t=new Test();
t.m1(new Object());
t.m1("Java");
t.m1(null);
//case3
t.m2(10,10.5f);
t.m2(10.5f,10);
//t.m2(10,10);//ambiguous
//        t.m2(10.f,10.f);//no suitable method found

    }
}
