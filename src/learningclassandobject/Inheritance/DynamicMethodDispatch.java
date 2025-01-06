package learningclassandobject.Inheritance;
class Sup1
{
     void meth1()
    {
        System.out.println("Super Meth1");
    }
    static public void write(){
        System.out.println("parent1");
    }
     void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class Sub1 extends Sup1
{
    @Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }

    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args)
    {
        Sup1 sup=new Sub1();
        Sup1.write();
        Sub1 s=new Sub1();
        s.write();

        sup.meth1();
        sup.meth2();


    }
}
