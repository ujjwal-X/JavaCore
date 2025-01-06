package designpattern.singleton;
//creates multiple instances if two thread
// access this method simultaneously

class Singleton {
   private static volatile Singleton singletonRefernce;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singletonRefernce==null){
            singletonRefernce=new Singleton();
        }
        return singletonRefernce;
    }
}


public class NormalSingleton extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            Singleton instance =Singleton.getInstance();
            System.out.println(instance);
        }
    }

    public static void main(String[] args) {
        NormalSingleton t1=new NormalSingleton();
        NormalSingleton t2=new NormalSingleton();
        NormalSingleton t3=new NormalSingleton();
        t3.start();
        t1.start();
        t2.start();
        //run program multiple times if it didn't show different hashcode values

    }
}

