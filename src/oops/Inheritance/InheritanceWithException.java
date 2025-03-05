package oops.Inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    // Method with checked exception
    public void show() throws IOException {
        System.out.println("Parent class show() method.");
    }

    // Method without any exceptions
    public void display() {
        System.out.println("Parent class display() method.");
    }
}

class Child extends Parent {
    // Overriding method with a narrower checked exception
    @Override
    public void show() throws FileNotFoundException {
        System.out.println("Child class show() method.");
    }

    // Overriding method throwing an unchecked exception
    @Override
    public void display() {
        System.out.println("Child class display() method.");
        throw new ArithmeticException("Unchecked Exception thrown by Child.");
    }
}



public class InheritanceWithException {

    public static void main(String[] args) {
        Parent obj = new Child();

        // Handle checked exception for the overridden show() method
        try {
            obj.show();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Unchecked exception from overridden display() method
        obj.display(); // This will throw ArithmeticException at runtime
    }
}
