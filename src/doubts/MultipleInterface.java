package doubts;

interface I1{
    void print();
    default void m1(){
        System.out.println("I1");
    }
}
interface I2{
    void print();
    default void m1(){
        System.out.println("I1");
    }
}

public class MultipleInterface implements I1,I2 {

    @Override
    public void print() {
            System.out.println(getClass().getName());
    }

    @Override
    public void m1() {
        I1.super.m1();
    }


    public static void main(String[] args) {
        MultipleInterface m= new MultipleInterface();
        m.print();
    }
}
