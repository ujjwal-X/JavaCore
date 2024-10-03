package DeepShallowCopy;
class A{
    int x;
    int y;
    public A(Clone c) {
        x=c.x;
        y=c.y;
    }
}
public class Clone {
    int x=10;
    int y=20;

    public static void main(String[] args){


        Clone c=new Clone();
        A a=new A(c);

        System.out.println(c.x);
        System.out.println(c.y);
        c.x=100;
        c.y=199;
        System.out.println(c.x);
        System.out.println(c.y);






    }
}
