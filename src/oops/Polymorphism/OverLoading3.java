package oops.Polymorphism;
//in  methodOverloading method resolution is always based on reference type but not on run time object
class Animal{

}
class Moneky extends Animal{

}
public class OverLoading3 {
    public void m1(Animal A){
        System.out.println("Animal version");
    }
    public void m1(Moneky M){
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        OverLoading3 o=new OverLoading3();
        Animal a=new Animal();
        o.m1(a);

        Moneky m=new Moneky();
        o.m1(m);

        Animal a1=new Moneky();//overloading gives more priority to reference type
        o.m1(a1);

    }
}
