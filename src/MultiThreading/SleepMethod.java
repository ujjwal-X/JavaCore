package MultiThreading;

public class SleepMethod {
    public static void main(String[] args) throws InterruptedException {

       for (int i=0; i<100;i++){
           System.out.println("Thread main"+ i);
           Thread.sleep(1000);
       }
    }
}
