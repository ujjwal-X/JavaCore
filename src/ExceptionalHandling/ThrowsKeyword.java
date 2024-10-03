package ExceptionalHandling;


import javax.imageio.IIOException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
//case 1 => In this way we are performing and handling code on our own
//        try{
//            Thread.sleep(1000);
//        }
//        catch (InterruptedException e){
//            System.out.println(e);
//        }
//case 2 => to delegate responsibility handling the exception to caller so JVM is handle the exception now caller is responsible to handle the exception
//        Thread.sleep(1000);
// case 3=>
doStuff();
// case 4 => fully checked exception gives error when written code doesn't throw or go to catch block
// try{
//            System.out.println("try");
////            Thread.sleep(100);
//        }
//        catch (InterruptedException e){
//
//        }

   }
    public static void  doStuff() throws InterruptedException{
        doMoreStuff();
    }
    public static  void doMoreStuff() throws InterruptedException{
        System.out.println("Thread is sleeping");
        Thread.sleep(10000);
        System.out.println("Thread is awake");
    }
}
