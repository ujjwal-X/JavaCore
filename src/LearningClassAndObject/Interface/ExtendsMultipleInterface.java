package LearningClassAndObject.Interface;
interface It1{
    void m1();
}
interface It2 extends It1{
    void m2();
}
interface It3 extends It2{
    void m3();
}
class ServiceProvider1 implements It1,It2,It3{
    @Override
    public void m1() {
        System.out.println("interface1");
    }

    @Override
    public void m2() {
        System.out.println("interface2");
    }

    @Override
    public void m3() {
        System.out.println("interface3");
    }
}
public class ExtendsMultipleInterface {
    public static void main(String[] args) {
        ServiceProvider1 s=new ServiceProvider1();
        s.m1();
        s.m2();
        s.m3();
    }
}
