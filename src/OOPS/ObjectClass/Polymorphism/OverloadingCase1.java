package OOPS.ObjectClass.Polymorphism;

public class OverloadingCase1 {

    void m1(int i){
        System.out.println("int args"+i);
    }
    int m1(int x,int y){
        System.out.println("int method");
        return x;
    }
    void m1(float f){
        System.out.println("float"+f);
    }
    void m1(double d){
        System.out.println("double args");
    }
    public static void main(String[] args) {
        OverloadingCase1 t=new OverloadingCase1();
       t.m1('a');
        t.m1(10);//automatic promoting to int compiler will not give any error
        t.m1(100l);//convert long to float
    }
}
