package learningclassandobject;

class ReactangleClass {
    double length,breadth;
    double area(){
        return  length*breadth;
    }
    double perimeter(){
        return  2*(length+breadth);
    }
}
public  class Reactangle {
    public static void main(String[] args) {
        ReactangleClass r1=new ReactangleClass();
        r1.length=5;
        r1.breadth=10;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        ReactangleClass r2=new ReactangleClass();
        r2.length=50;
        r2.breadth=120;
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
    }
}

