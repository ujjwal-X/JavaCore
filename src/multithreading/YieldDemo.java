package multithreading;
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            Thread.yield();
            System.out.println("Child thread");

        }
    }
}
public class YieldDemo {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        for (int i=0; i<10;i++){
            System.out.println("Parent thread");
        }
    }
}
