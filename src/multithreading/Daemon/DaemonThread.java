package multithreading.Daemon;
class MyThread extends Thread{

}

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
//        Thread.currentThread().setDaemon(true);//.IllegalThreadStateException
        MyThread mt=new MyThread();
        System.out.println(mt.isDaemon());
        mt.setDaemon(true);
        System.out.println(mt.isDaemon());

    }
}
