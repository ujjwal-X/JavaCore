package learningclassandobject.polymorphism.overloading;

class Test
{
    public void methodOne(int i)
    {
        System.out.println("int-arg method");
    }
    public void methodOne(float f) //overloaded methods
    {
        System.out.println("float-arg method");
    }
    public static void main(String[] args)
    {
        Test t=new Test();

//t.methodOne('a');//int-arg method
//t.methodOne(10l);//float-arg method
//        t.methodOne(10.5);//C.E:cannot find symbol to run this we have to make it float by using .f
    }
}
