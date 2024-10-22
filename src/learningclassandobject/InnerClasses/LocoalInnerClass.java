package learningclassandobject.InnerClasses;
//Method-local Inner Class
//In Java, we can write a class within a method and this will be a local type. Like local variables, the scope of the inner class is restricted within the method.
//
//A method-local inner class can be instantiated only within the method where the inner class is defined. The following program shows how
// to use a method-local inner class.
public class LocoalInnerClass {
    // instance method of the outer class
    void my_Method() {
        int num = 23;

        // method-local inner class
        class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class "+num);
            }
        } // end of inner class

        // Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String args[]) {
        LocoalInnerClass outer = new LocoalInnerClass();
        outer.my_Method();
    }
}

