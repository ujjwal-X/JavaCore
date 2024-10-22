package learningclassandobject.StaticAndFinal;

class Test{
    static int x=10;
    int y=20;
    void show(){
        System.out.println(x+" "+y);
    }
    static void display(){
//        we cannot non-static data member inside static methods
        System.out.println(x+" ");//y cannot be accessed here
    }
}
public class Static {
    public static void main(String[] args) {
        Test t1=new Test();
        Test.x =30;
        t1.show();
        Test t2=new Test();
        t2.show();
    }
}
