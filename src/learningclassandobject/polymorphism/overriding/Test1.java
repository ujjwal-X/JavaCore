package learningclassandobject.polymorphism.overriding;

//Co-variant return type concept is applicable only for object types but not for
//primitives.
class Parent1 {
 public Object methodOne() {
         return null;
         }
 }
 class Child1 extends Parent1 {
 public String methodOne() {
         return null;
         }
 }
public class Test1 {
    public static void main(String[] args) {

    }
}
