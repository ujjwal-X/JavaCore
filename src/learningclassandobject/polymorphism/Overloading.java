package learningclassandobject.polymorphism;
//method overRiding is also called Run time Polymorphism

public class Overloading {

    // Overloaded method to print an integer
    public void print(int number) {
        System.out.println("Printing integer: " + number);
    }

    // Overloaded method to print a string
    public void print(String text) {
        System.out.println("Printing string: " + text);
    }

    // Overloaded method to print a double
    public void print(double number) {
        System.out.println("Printing double: " + number);
    }

    public static void main(String[] args) {
        Overloading printer = new Overloading();
        printer.print(10);        // Calls print(int)
        printer.print("Hello");   // Calls print(String)
        printer.print(10.5);      // Calls print(double)
    }
}

