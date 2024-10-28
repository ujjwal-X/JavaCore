package learningclassandobject.polymorphism.overloading;
//var arg method => In general var-arg method will get less priority that is if no other method matched then
//only var-arg method will get chance for execution it is almost same as default case inside
//switch.
class Test5{
    public void methodOne(int i) {
        System.out.println("general method");
    }
    public void methodOne(int...i) {//we have to specify data type in var arg
        System.out.println("var-arg method");
    }
    public static void main(String[] args) {
        Test5 t=new Test5();
        t.methodOne();//var-arg method
        t.methodOne(10,20);//var-arg method
        t.methodOne(10);//general method
        t.methodOne();
    }
}