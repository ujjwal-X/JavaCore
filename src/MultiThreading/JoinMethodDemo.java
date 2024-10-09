package MultiThreading;
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println("Child thread");
            try {

                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}
public class JoinMethodDemo  {
    public static void main(String[] args)throws InterruptedException {
MyThread1 mt=new MyThread1();
mt.start();
        mt.join(1000);
        for(int i=0; i<10;i++){

            System.out.println("Main thread");

        }
    }
}
