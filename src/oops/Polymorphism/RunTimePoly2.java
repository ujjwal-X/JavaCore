package oops.Polymorphism;
class Bike1{
    int speedlimit=90;
    void write(){
        System.out.println("bike method....");
    }
}
class Honda3 extends Bike1{
    int speedlimit=150;// Variable hiding this value is hided by bike speed limit so whenever you print speedLimitit shows 90
    void write(){
        System.out.println("Honda3 method....");
    }
}
public class RunTimePoly2 extends Honda3 {
    public static void main(String[] args){
        Bike1 obj=new Honda3();
        obj.write();
        Honda3 h=new Honda3();
        System.out.println(h.speedlimit);
        System.out.println(obj.speedlimit);

    }
}
