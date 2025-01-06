package multithreading;
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i <= 100; i++)
        {
            System.out.println("Thread-1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//Defining second thread with task
//The task of this thread is to print the numbers from 1001 to 2000
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i<= 100; i++)
        {
            System.out.println("Thread-2");
        }
    }
}

public class MultiThreading1
{
    //Main Thread
    public static void main(String[] args)
    {
        //Creating first thread
        Thread1 t1 = new Thread1();
        t1.start();


        //Creating second thread
        Thread2 t2 = new Thread2();
        t2.start();

    }
}
