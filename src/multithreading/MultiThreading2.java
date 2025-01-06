package multithreading;
class Threading extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println("Child thread"+Thread.currentThread().getName());
        }
    }
}

public class MultiThreading2 {
    public static void main(String[] args) {
        Threading t=new Threading();
        t.start();

        for (int i=0; i<10;i++){
            System.out.println("Main thread"+Thread.currentThread().getName());
        }
//        t.start(); // if we call the same thread again it will throw illegalThreadStateException

    }
}
