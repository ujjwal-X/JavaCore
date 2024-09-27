package OOPS.ObjectClass.Constructor;
//What are Constructors in Java?
//In Java, a Constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling
// the constructor, memory for the object is allocated in the memory. It is a special type of method that is used to initialize the object.
// Every time an object is created using the new() keyword, at least one constructor is called.
public class Constructor {
//Types of Constructors in Java
//Default Constructor
//Parameterized Constructor
    int x;
    String s;
    // constructor can be public protected private
    Constructor(){//default
       return;
  }
    public static void main(String[] args) {
Constructor c=new Constructor();
        if (c != null) {
            // Check the value property
            System.out.println("Instance created successfully.");
            System.out.println("Value: "); // Output: Value: 10
        } else {
            System.out.println("Instance creation failed.");
        }
//        Constructor c1=new Constructor(10);
//        System.out.println(c);
//
//        System.out.println(c.x);
//        System.out.println(c.s);// when we didn't write our own constructor JVM create default constructor for us to initialize the default value to instance variable
  }
}
