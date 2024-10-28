package learningclassandobject.polymorphism.overloading;
//In overloading method resolution is always based on reference type and runtime object
//won't play any role in overloading.
class Animal{ }
class Monkey extends Animal{}
class Test6{
    public void methodOne(Animal a) {
        System.out.println("Animal version");
    }
    public void methodOne(Monkey m) {
        System.out.println("Monkey version");
    }
    public static void main(String[] args) {
        Test6 t=new Test6();
        Animal a=new Animal();
        t.methodOne(a);//Animal version
        Monkey m=new Monkey();
        t.methodOne(m);//Monkey version
        Animal a1=new Monkey();
        t.methodOne(a1);//Animal version
    }
}
