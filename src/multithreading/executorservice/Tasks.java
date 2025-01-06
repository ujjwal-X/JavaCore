package multithreading.executorservice;

public class Tasks extends Thread {
    @Override
    public void run() {
        System.out.println("----Task Started----");
        for(int i=0; i<100; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----Task Done----");
    }
}
