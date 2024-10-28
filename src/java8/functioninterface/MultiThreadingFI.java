package java8.functioninterface;


//class MyRunnable implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i=0; i<10; i++){
//            System.out.println("Child Thread");
//        }
//    }
//}


public class MultiThreadingFI {
    public static void main(String[] args) {

        Runnable r=()->{
            for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }};
        Thread t=new Thread(r);
        t.start();
        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
