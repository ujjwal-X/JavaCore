package learningclassandobject.Inheritance;
class  Demo1 {
    Demo1(){
        System.out.println("Demo 1");
    }
    void display(){
        System.out.println("demo1");
    }
}
class  Demo2 extends Demo1{
    Demo2(){
        System.out.println("Demo 2");
    }

}
class  Demo3 extends  Demo2{
    Demo3(){
        System.out.println("Demo 3");
    }
    void display(){
        System.out.println("demo3");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
Demo1 d=new Demo3();
d.display();
    }
}
