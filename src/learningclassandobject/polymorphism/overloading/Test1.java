package learningclassandobject.polymorphism.overloading;
class Test1 {
    public void methodOne() {
        System.out.println("no-arg method");
    }
    public void methodOne(int i) {
        System.out.println("int-arg method"); //overloaded methods
    }
    public void methodOne(double d) {
        System.out.println("double-arg method");
    }
    public static void main(String[] args) {
        Test1 t=new Test1();
        t.methodOne();//no-arg method
        t.methodOne(10);//int-arg method
        t.methodOne(10.5);//double-arg method
    }
}
