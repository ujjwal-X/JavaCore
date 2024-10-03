package LearningClassAndObject.Constructor;

public class Example {
    String name;
    int roll;
    Example(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Example e= new Example();
        System.out.println(e.name);
        System.out.println(e.roll);
        System.out.println(e);

    }
}
