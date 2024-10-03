package LearningClassAndObject;
//Java Create separate .class  file for each class  when it converts into byte code
class CircleClass {
    double radius;

    private void print(){
        System.out.println("Hello");
    }
    protected void protectedPrintf(){
        System.out.println("Hello");
    }
    void privatePrint(){
        print();
    }
    double  area(){
        return Math.PI*radius*radius;
    }
    double  perimeter(){
        return  2*Math.PI*radius;
    }
    double circumference(){
        return perimeter();
    }
}


public class Circle{
    public static void main(String[] args) {
        CircleClass circle=new CircleClass();
        CircleClass circle2=new CircleClass();
        circle.privatePrint();
        circle.protectedPrintf();
        circle2.radius=7;
        circle.radius=12;
        System.out.println("Area of "+circle.area());
        System.out.println("Area of "+circle.area());
        System.out.println("Area of "+circle2.area());
        System.out.println("Perimeter of "+circle.perimeter());
        System.out.println("circumference of "+circle.circumference());
    }
}