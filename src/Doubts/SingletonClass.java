package Doubts;
 class Singleton {
    private static final Singleton instance = new Singleton();
    private  Singleton(){};
    public static Singleton getInstance() {
        return instance;
    }
}


public class SingletonClass {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Both objects are the same instance.");
        }
    }
}
