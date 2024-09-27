package OOPS.ObjectClass.Abstraction;
abstract class Shape{
    String color;
     abstract double area();
    public abstract String toString();
    Shape(String color){
        System.out.println("Shape constructor called");
        this.color=color;
    }
    String getColor(){
        return color;
    };

}

class Circle extends Shape{
    double radius;
    Circle(String color,double r){
        super(color);
        System.out.println("Circle constructor called");
        this.radius=r;
        this.color=color;
    }
            double area(){
                return Math.PI*radius*radius;
            }
            public String toString(){
                return "Circle color is " + super.getColor()
                        + "and area is : " + area();         }

        }
        class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String color,double length,double width){
        super(color);
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.width=width;
    }
            double area(){
                return length*width;
            }
            public String toString(){
                return "Rectangle color is " + super.getColor()
                        + "and area is : " + area();
            }

        }
public class AbstractionShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
