package OOPS.ObjectClass.Abstraction;
//abstraction encapsulation inheritance polymorphism
//public private protected
abstract class Animals{
    int x;// there is no restriction in instance variable inside animals
    abstract void animalSound();// public protected default is allowed private adn final is not allowed


     static void hasFourLegs (){
        System.out.println("4");

    }
}
class Dog extends Animals{

    @Override
    public void animalSound() {

    }
//    it is not compulsory to override declared class but it is compulsory ro override abstract class
}
public class AbstractClass {
    public static void main(String[] args) {

Dog d=new Dog();
d.animalSound();

    }
}
