package MultiThreading;
class Priortiy1 extends Thread{
    public void run() {
        System.out.println("Prioirty 2 "+Thread.currentThread().getPriority());
        System.out.println("Child 1 Thread");
    }
}
class Priority extends Thread{
    @Override
    public void run() {
        System.out.println("Prioirty 1 "+Thread.currentThread().getPriority());
        System.out.println("Child 2 Thread");
    }
}

public class GetPrioirty {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());//5 default priority of main thread
        Priority p=new Priority();
        Priortiy1 p1=new Priortiy1();
        p1.setPriority(8);
        p1.start();
        p.setPriority(9);
        p.start();
        System.out.println("Parent Thread");
    }
}

