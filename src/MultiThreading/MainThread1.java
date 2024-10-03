package MultiThreading;
//in Java main class one thread is always running which is created by JVM


import java.util.Scanner;

//Now so to use MultiThreading we will extends Thread class in our current class
class A extends Thread{
   public void run(){
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();//program doesn't wait here for input it will run another excecution written program
       for (int i=1;i<=n; i++){
           System.out.println("i am the run function present in A class ");
       }

    }
}
class B extends  Thread{

    public  void run(){
        for (int i=1;i<=100; i++){
            System.out.println("i am the run function present in B class ");
        }

    }

}
public class MainThread1 {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.start();
        obj1.start();
    }

}
