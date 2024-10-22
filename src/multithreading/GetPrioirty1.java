package multithreading;

public class GetPrioirty1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setPriority(2);
        System.out.println(t.getPriority());    //Output : 8
    }
}