package deepshallowcopy;
class Rectangle {
    private int breadth;
    private int length;

    public Rectangle() {
        breadth = 0;
        length = 0;
    }

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    // Copy constructor for deep copy
    public Rectangle(Rectangle other) {
        this.breadth = other.breadth;
        this.length = other.length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area() {
        return length * breadth;
    }
}

public class Shallow {
    public static void main(String[] args) {
        // Create an initial Rectangle object
        Rectangle rectangle = new Rectangle(10, 10);

        // Perform shallow copy by assigning the reference
        Rectangle rectangle1 = rectangle;

        // Modify the original object
        rectangle.setLength(10);
        rectangle.setBreadth(10);

        // Both rectangle and rectangle1 point to the same object
        System.out.println("Shallow Copy - Rectangle Area: " + rectangle.area());
        System.out.println("Shallow Copy - Rectangle1 Area: " + rectangle1.area());

        // Modify the object via the first reference
        rectangle.setBreadth(100);
        System.out.println("Shallow Copy - Rectangle Area after modifying breadth: " + rectangle.area());
        System.out.println("Shallow Copy - Rectangle1 Area after modifying breadth: " + rectangle1.area());

        // Modify the object via the second reference
        rectangle1.setLength(50);
        System.out.println("Shallow Copy - Rectangle Area after modifying length: " + rectangle.area());
        System.out.println("Shallow Copy - Rectangle1 Area after modifying length: " + rectangle1.area());

        // Display hash codes
        System.out.println("Shallow Copy - Rectangle hashCode: " + rectangle.hashCode());
        System.out.println("Shallow Copy - Rectangle1 hashCode: " + rectangle1.hashCode());




        // Create an initial Rectangle object
        Rectangle rectangle2 = new Rectangle(2, 2);

        // Perform deep copy using the copy constructor
        Rectangle rectangle3 = new Rectangle(rectangle2);
        System.out.println("Perform deep copy using the copy constructor");

        // Modify the original object
        rectangle2.setLength(5);
        rectangle2.setBreadth(5);

        // Since rectangle3 is a deep copy, it will not reflect changes made to rectangle2
        System.out.println("Deep Copy - Rectangle2 Area: " + rectangle2.area());
        System.out.println("Deep Copy - Rectangle3 Area: " + rectangle3.area());

        // Display hash codes
        System.out.println("Deep Copy - Rectangle2 hashCode: " + rectangle2.hashCode());
        System.out.println("Deep Copy - Rectangle3 hashCode: " + rectangle3.hashCode());

    }
}



