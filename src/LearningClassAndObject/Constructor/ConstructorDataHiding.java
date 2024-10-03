package LearningClassAndObject.Constructor;
class Cylinder{
    private int radius;
    private  int height;
    int getRadius(){
        return  radius;
    }
    int getHeight(){
        return  height;
    }

    void setRadius(int radius){
        this.radius=radius;
    }
    void setHeight(int height){
        this.height=height;
    }
    Cylinder(){
        this.radius=1;
        this.height=1;
        System.out.println("this is non parametrized constructor");
    }
    Cylinder(int radius){
        this.radius=radius;
        System.out.println("this is single parametrized constructor");

    }
    Cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
        System.out.println("this is two parametrized constructor");
    }


}
public class ConstructorDataHiding {
    public static void main(String[] args) {
      Cylinder c1=new Cylinder(30,40);
//      c1.setRadius(10);
//      c1.setHeight(20);
        System.out.println( c1.getRadius());
        System.out.println(c1.getHeight());

    }
}
