package oops.Inheritance;
class Animal {
//    Animal(int x){
//        System.out.println("constructor animal");
//    }
    //if you make your own parametrized constructor it is mandatory to write in child or subclass also.It will
//If superclass doesn’t have default constructor, then subclass also needs to have an explicit constructor defined. Else it will throw compile time exception. In the subclass constructor, call to superclass constructor is mandatory in this case and it should be the first statement in the subclass constructor.
    public void makeSound() {

        System.out.println("Animal is making a sound");

    }

}
class Dog extends Animal {

    @Override

    public void makeSound() {

        System.out.println("Dog is barking");

    }
    void myName(){
        System.out.println("Dog");
    }

}
public class InheritanceOverRiding {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.makeSound();
        Dog d=new Dog();
        d.makeSound();
        Animal a1=new Dog();//downCasting when we are making object with the parent refernce
//        we cant use the specialized property of dog named myNameis because its not present in animal
        Dog d1=(Dog) a;//upcasting
        d1.makeSound();
    }
}


