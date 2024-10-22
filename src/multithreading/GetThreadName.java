package multithreading;
class ThreadName extends Thread{

}

public class GetThreadName {
    public static void main(String[] args) {
        ThreadName tn=new ThreadName();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MainThread");
        System.out.println(Thread.currentThread().getName());
    }

}
