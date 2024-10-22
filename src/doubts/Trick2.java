package doubts;

class Base1{
    Base1(){
        System.out.println("Base Constructor");
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived Constructor");
    }
}
public class Trick2 {
    public static void main(String[] args) {
        Derived1 obj=new Derived1();
    }
}

