package OOPS.ObjectClass.Abstraction;
//abstract method the method which has only
// declaration but ot implementation and which ends on semi colon
//abstract methods cannot have body so you have to end it with semicolon with zero curly brackets
abstract class Panda{
     int x=10;
    Panda(){
        System.out.println("I am the constructor of abstract class");
//Q Why abstract class contains constructor??
//Abstract classes can have constructors because they often need to initialize fields or perform setup that will be inherited by subclasses.
// Even though you can’t instantiate an abstract class directly, its constructor is called when a subclass is instantiated. This allows the
// abstract class to enforce certain initialization logic and maintain consistency across its derived classes.
    }
}
class Bird extends Panda{
    void breed(){};//
    void color(){};
}
public class AbstractKeyword {
//    abstract void print();we cant write abstract method in non abstract class
public static void main(String[] args) {
    Bird b=new Bird();
    b.breed();//this will print nothing thats why there is no sense of making object of class which contains dummy methods

}


}
//Q why we use abstract class?
// An abstract class is mostly used to provide a base for subclasses to extend and implement the abstract methods and override
// or use the implemented methods in abstract class
