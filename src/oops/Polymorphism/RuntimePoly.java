package oops.Polymorphism;
class Bike{
    int x=10;
    void run(){
        System.out.println("Running .......");
    }
}
class Pulsar extends Bike{
    @Override
    void run() {
        System.out.println("running safely with 60km");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Pulsar x=new Pulsar();
        x.run();
        Bike b=new Bike();
        b.run();
    }
}
