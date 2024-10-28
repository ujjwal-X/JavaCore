package learningclassandobject.polymorphism.overloading;

class Test3
{

    public void methodOne(String s)
    {
        System.out.println("String version");
    }
    public void methodOne(Object o) //Both methods are said to
    {System.out.println("Object version");
    }
    public static void main(String[] args)
    {
        Test3 t=new Test3();
        t.methodOne("arun");//String version
        t.methodOne(new Object());//Object version
        t.methodOne(null);//String version
    }
}
