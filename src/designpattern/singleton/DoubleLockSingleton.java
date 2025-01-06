package designpattern.singleton;

//An implementation of double checked
// locking of Singleton. Intention is to reduce cost
// of synchronization and improve performance, by only
// locking critical section of code, the code which
// creates instance of Singleton class.

class DoubleLock{
    private static DoubleLock dlock;

    private DoubleLock(){}

    public static DoubleLock getInstance(){
        if(dlock==null){
            synchronized (DoubleLock.class){
                if(dlock==null){
                    dlock=new DoubleLock();
                }
            }
        }
        return dlock;
    }
}

public class DoubleLockSingleton extends Thread{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            DoubleLock doubleLock= DoubleLock.getInstance();
            System.out.println(doubleLock);
        }
    }

    public static void main(String[] args) {
        DoubleLockSingleton d1=new DoubleLockSingleton();

        DoubleLockSingleton d2=new DoubleLockSingleton();

        d1.start();
        d2.start();
    }
}
