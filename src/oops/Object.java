package oops;

//Static method >> constructor static methods prints first then constructor
public class Object {
//public default abstract final strictfp are only allowed in top level
//  private protected and static are also allowed for inner classes
    static{
        System.out.println("hello");
    }
    static int xx=10;
    public static void main(String[] args) {
       int x;



        System.out.println(xx);
//      System.out.println(x); java: variable x might not have been initialized   we can declare local varable empty
        System.out.println("object");
    }
}
abstract  class Animal{

}
final  class  WaterAnimals{}






//An entity that has state and behaviors is known as object
//An object is a real-world entity.
//An object is a runtime entity.
//The object is an entity which has state and behavior.
//The object is an instance of a class.
//Object is an instance of class which represent real world entity .It creates based on blueprint provided by class and
// has its own identity state and behaviour

//Class is user defined datatype that serves as a blueprint