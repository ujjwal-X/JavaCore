package Methods;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("before call");
        func();
        System.out.println("After call");
    }
    public static void func(){
        System.out.println("Middle function");
    }
}
