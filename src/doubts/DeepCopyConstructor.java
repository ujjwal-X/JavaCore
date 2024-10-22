package doubts;
class A{
    public int x=10;
    A(DeepCopyConstructor obj){
        x=obj.x;
    }
}

public class DeepCopyConstructor {
    public int x=100;

    public static void main(String[] args) {
        DeepCopyConstructor d=new DeepCopyConstructor();
        A a=new A(d);
        System.out.println(d.x);
        System.out.println(a.x);
        d.x=1000;

        System.out.println(d.x);
        System.out.println(a.x);


    }
}
