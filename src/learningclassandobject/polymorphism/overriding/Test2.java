package learningclassandobject.polymorphism.overriding;
//final class and parents are not overrided
//Parent class non final methods we can override as final in child class. We can
//override native methods in the child classes.
 class Parent2 {

// public final void methodOne() {}

}
class Child2 extends Parent2{
    {
        System.out.println("instance called");
    }

}

 public class Test2{
  public static void main(String[] args) {
   Child2 c= new Child2();
      Child2 c1= new Child2();

  }
}
