package learningclassandobject.Inheritance;
class Parent1{
    Parent1(){
        System.out.println("i am Parent");
    }


}
class Child1 extends Parent1{
    Child1(){


        System.out.println("i am Child");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Child1 c=new Child1();
    }
}
