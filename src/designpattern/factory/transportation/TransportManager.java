package designpattern.factory.transportation;

public class TransportManager {
    public static void main(String[] args) {
        Transport t=TransportFactory.getTransport("Truck");
        System.out.println(t);
        t.deliver();
    }
}
