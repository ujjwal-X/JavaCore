package java8.lambdaexpression;
interface Isub{
    void sub(int x,int y);
}
public class Addition {
    public static void main(String[] args) {
        Add a=(x,y)-> x+y;
        System.out.println(a.addition(10,20));
        a.print();
        Isub s=(x,y)-> System.out.println(x-y);
        s.sub(100,200);
    }
}
