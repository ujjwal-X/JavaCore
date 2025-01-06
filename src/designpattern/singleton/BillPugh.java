package designpattern.singleton;

class SingletonInner{
    private SingletonInner(){
        if (SingletonHelper.s != null) {
            throw new IllegalStateException("Instance already created");
        }
    };
    private static class SingletonHelper{
        private static final SingletonInner s=new SingletonInner();
    }
    public static  SingletonInner getInstance(){
        return SingletonHelper.s;
    }
}

public class BillPugh extends Thread {
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(SingletonInner.getInstance());
        }
    }

    public static void main(String[] args) {
        BillPugh b1=new BillPugh();
        BillPugh b2=new BillPugh();
        BillPugh b3 =new BillPugh();
        b1.start();
        b2.start();
        b3.start();
    }
}
