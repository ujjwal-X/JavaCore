package oops.Inheritance;
//so with the help of super we can call parent class methods
class Animal1 {

    public void makeSound() {

        System.out.println("Animal is making a sound");

    }
    static void name(){
        System.out.println("Animal method name");
    }

}

class Dog1 extends Animal1 {

    @Override

    public void makeSound() {

        super.makeSound();

        System.out.println("Dog is barking");

    }
    static void name(){
        System.out.println("Dog method name");
    }

}
public class InheritanceSuper {
    public static void main(String[] args) {
        Dog1 d=new Dog1();
        d.makeSound();
        Animal1 a=new Animal1();
        
    }
}
