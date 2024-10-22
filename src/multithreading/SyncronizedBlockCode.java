package multithreading;
class Display1{
    public  void wish(String name){
        System.out.println("irregular");
        for (int i=0; i<10; i++){

            System.out.print("Good Morning ");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
            }
            System.out.println(name);
        }
//        lakhs of code written
        System.out.println("regular");
       synchronized (this){
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
}
class MyThread11 extends Thread{
    Display1 d;
    String name;
    MyThread11(Display1 d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class SyncronizedBlockCode {
    public static void main(String[] args) {

            Display1 d = new Display1();
            MyThread11 m1 = new MyThread11(d, "Dhoni");
            MyThread11 m2 = new MyThread11(d, "Kholi");
            MyThread11 m3 = new MyThread11(d, "Yuvraj");
            m1.start();
            m2.start();
            m3.start();

    }
}
