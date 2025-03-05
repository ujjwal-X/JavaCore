package solid;

import java8.stream.w3resourse.Square;

//Example (Before OCP)
//Adding a new shape (for example, triangle) requires modifying the AreaCalculator class:
class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        }
        return 0;
    }
}


//Example (After OCP)
//Using polymorphism avoids modifying existing code when adding new shapes:

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class AreaCalculator1 {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}



public class OpenClosed {
    public static void main(String[] args) {
        //a class is open for extension closed for modification
       //Classes should be open for extension but closed for modification.
        AreaCalculator a=new AreaCalculator();


        // Create instances of Circle and Rectangle
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6); // Rectangle with width 4 and height 6

        System.out.println(a.calculateArea(circle));
        // Create an AreaCalculator
        AreaCalculator calculator = new AreaCalculator();

        // Calculate and display areas
        System.out.println("Area of Circle: " + calculator.calculateArea(circle));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(rectangle));
    }
}
