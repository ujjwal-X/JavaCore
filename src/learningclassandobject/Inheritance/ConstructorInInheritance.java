package learningclassandobject.Inheritance;
class Parent{
    Parent(){
        System.out.println("i am parent constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("i am Child constructor");
    }
}
class  Tiny extends  Child{
    Tiny(){
        System.out.println("i am Tiny constructor");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Tiny t=new Tiny();
    }
}
