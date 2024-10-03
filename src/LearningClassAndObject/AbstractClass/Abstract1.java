package LearningClassAndObject.AbstractClass;
//abstract class is generally created to gives standards
abstract class Super
{
    int x=1;
    public Super() { System.out.println("Super Constructor"); }
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }

    abstract public void meth2();
}

class Sub extends Super
{
    @Override
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}
public class Abstract1 {
    public static void main(String[] args)
    {
        Super s=new Sub();
        s.meth1();
        s.meth2();
    }
}
