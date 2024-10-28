package learningclassandobject.polymorphism;
class Animal {
    // Method in superclass
    int x=10;
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
    public  void legs(){
        System.out.println("4 legs");
    }
    static void animalsStatic(){
        System.out.println("Animal is statiic");
    }
}

class Dog extends Animal {
    // Overridden method in subclass
    int x=100;
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    public  void legs(){
        System.out.println("4 legs");
    }
    static void animalsStatic(){
        System.out.println("Dog is statiic");
    }
}

public class OverRidding {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Dog d=new Dog();
        d.animalsStatic();
        myDog.animalsStatic();
        myDog.makeSound();  // Calls the overridden method in Dog
        myDog.legs();
        System.out.println(myDog.x);
        System.out.println(myDog instanceof Dog);
        System.out.println(myDog instanceof Animal);
    }
}
