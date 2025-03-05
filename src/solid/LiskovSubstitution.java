package solid;
// user( Swiggy ) ->1. customer 2. delivery 3.restaurant in which user contains kyc method which is not usable for customer but still it has to override it
//to solve this we can add another layer of interface between delivery and restaurant   with name of swiggy partners to solve empty kyc method issue in customer
//Example (Violation of LSP)
//A Square class is not substitutable for a Rectangle because of its behavior.
//
//class Rectangle1 {
//    int width, height;
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public int calculateArea() {
//        return width * height;
//    }
//}
//
//class Square extends Rectangle1 {
//    @Override
//    public void setWidth(int width) {
//        super.setWidth(width);
//        super.setHeight(width);
//    }
//
//    @Override
//    public void setHeight(int height) {
//        super.setWidth(height);
//        super.setHeight(height);
//    }
//}


//Example (Adhering to LSP)
//Separate Square and Rectangle into different classes:

interface Shape1 {
    int calculateArea();
}

class Rectangle1 implements Shape1 {
    int width, height;

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square1 implements Shape1 {
    int side;

    public Square1(int side) {
        this.side = side;
    }

    public int calculateArea() {
        return side * side;
    }
}



public class LiskovSubstitution {
    public static void main(String[] args) {
        //Definition: Subtypes must be substitutable for their base types without altering the program's behavior.

        // Create Shape objects
        Shape1 rectangle = new Rectangle1(4, 5); // Substituting a Rectangle
        Shape1 square = new Square1(4);         // Substituting a Square

        // Both objects can be treated as Shapes
        System.out.println("Area of Rectangle: " + rectangle.calculateArea()); // Output: 20
        System.out.println("Area of Square: " + square.calculateArea());       // Output: 16

        // A method working with Shape can handle both Rectangle and Square
        printArea((Shape1) rectangle);
        printArea((Shape1) square);
    }

    public static void printArea(Shape1 shape) {
        System.out.println("Area: " + shape.calculateArea());
    }

}
