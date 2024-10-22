package exceptionalhandling;

public class IllegalArgumentExceptions extends Thread {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        t.setPriority(100);
    }
}
