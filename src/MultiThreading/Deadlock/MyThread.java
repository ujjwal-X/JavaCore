package MultiThreading.Deadlock;

class A {
    public  void d1(B b){
        System.out.println("Thread1 starts execution on d1()");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
        System.out.println("Thread1 trying to call B last method");
        b.last();
    }
    public synchronized void last(){
        System.out.println("Inside A");
    }
}
class B{
    public   void d2(A a){
        System.out.println("Thread 2 starts execution on d1()");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
        }
        System.out.println("Thread 2 trying to call B last method");
        a.last();

    }


    public synchronized void last(){
        System.out.println("Inside B");
    }
}


public class MyThread extends Thread{
    A a=new A();
    B b=new B();
    void m1(){
        this.start();
        a.d1(b);
    }

    @Override
    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.m1();
    }

}
