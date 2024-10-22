package multithreading;

class MT extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Lazy Thread");


        }


    }
}
public class InterruptedThread  {
    public static void main(String[] args) {
        MT m=new MT();
        m.start();
        m.interrupt();
    }
}
