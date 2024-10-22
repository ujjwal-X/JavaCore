package exceptionalhandling;

public class StackOverFlow {
    static  int counter=0;
    static void m1(){

        System.out.println("m1 mehtod"+ counter++);
        m2();
    }
    static void m2(){
        System.out.println("m2 method");
        m1();
    }
    public static void main(String[] args) {
        int counter=0;
    m1();

    }
}
