package multithreading;
class Display{
    public  synchronized void wish(String name){
        for (int i=0; i<10; i++){
            System.out.print("Good Morning ");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            }
            System.out.println(name);
        }
    }
}
class MyThread10 extends Thread{
    Display d;
    String name;
    MyThread10(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
Display d=new Display();
MyThread10 m1=new MyThread10(d,"Dhoni");
        MyThread10 m2=new MyThread10(d,"Kholi");
        MyThread10 m3=new MyThread10(d,"Yuvraj");
        m1.start();
        m2.start();
        m3.start();
    }
}
