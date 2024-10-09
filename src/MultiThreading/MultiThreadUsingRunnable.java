package MultiThreading;
class myRunnable implements Runnable{
   public void run(){
        for (int i=0; i<5;i++){
            System.out.println("Child thread");
        }
    }
}

public class MultiThreadUsingRunnable  {
    public static void main(String[] args) {
        myRunnable mr=new myRunnable();
        Thread t=new Thread(mr);
        t.start();
        for (int i=0; i<5;i++){
            System.out.println("Main thread");
        }


    }
}
