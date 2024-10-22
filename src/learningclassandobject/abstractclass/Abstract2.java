package learningclassandobject.abstractclass;

abstract class Shape{
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shape{
    int radius;

    Circle(int r){
        this.radius=r;
    }
    @Override
    void perimeter() {
        System.out.println(2*Math.PI*radius);
    }

    @Override
    void area() {
        System.out.println(Math.PI*radius*radius);
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    @Override
    void perimeter() {
        System.out.println(2*(length+breadth));
    }

    @Override
    void area() {
        System.out.println(length*breadth);
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.breadth=10;
        r.length=10;
        r.area();
        r.perimeter();
        Shape s=new Circle(10);
        s.area();
        s.perimeter();



    }
}
