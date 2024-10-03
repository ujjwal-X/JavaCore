package LearningClassAndObject.InnerClasses;
class A{
    public void func(){
        System.out.println("function present in A");
}
public static class AnonymousInnerClass  {
    public static void main(String[] args) {
        A a=new A()
        {
            public void  func(){
                System.out.println("Anonymous inner class");
            }
        };
        a.func();

    }
}
}
