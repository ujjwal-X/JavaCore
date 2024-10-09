package MultiThreading.InterThreadCommunication;
class MyThread extends Thread{
    int total=0;
    public  void run(){
        synchronized(this){
            this.notify();
        }
        for(int i=0; i<100;i++){
            total=total+i;
        }
    }


}
public class InterThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread m=new MyThread();
        MyThread m4=new MyThread();
        MyThread m3=new MyThread();
        MyThread m2=new MyThread();
        MyThread m1=new MyThread();
        m1.start();m2.start();m3.start();m4.start();
        m.start();
        Thread.sleep(1000);
        synchronized (m){
            m.wait();
        }

        System.out.println(m.total);

    }
}
