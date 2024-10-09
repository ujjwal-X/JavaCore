package MultiThreading;
class JoinMethod extends Thread{
    static Thread t;
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName());

            try{
                t.join();
            }
            catch (InterruptedException e){
        }
            System.out.println("Child thread");
    }
}
}
public class JoinOnMainMethod{
    public static void main(String[] args) throws InterruptedException{
        JoinMethod.t = Thread.currentThread();
        JoinMethod j = new JoinMethod();
        j.start();
        System.out.println(Thread.currentThread().getId());
        System.out.println(j.getId());
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("Parent thread");
            Thread.sleep(1000);
        }

    }
}
