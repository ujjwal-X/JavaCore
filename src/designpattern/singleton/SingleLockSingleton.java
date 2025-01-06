package designpattern.singleton;

//this is thread-safe and only
// creates one instance of Singleton on concurrent
// environment but it is unnecessarily expensive due to
// cost of synchronization at every call.

class SingleLock{
    private static SingleLock lock;
    private SingleLock(){}
    public static synchronized SingleLock getInstance(){
        if (lock==null){
            lock=new SingleLock();
        }
        return lock;
    }
}


public class SingleLockSingleton extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
           SingleLock lock=SingleLock.getInstance();
            System.out.println(lock);
        }
    }

    public static void main(String[] args) {
        SingleLockSingleton s1=new SingleLockSingleton();
        SingleLockSingleton s2=new SingleLockSingleton();
        s1.start();
        s2.start();
    }
}
