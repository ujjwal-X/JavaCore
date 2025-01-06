package designpattern.factory.transportation;

public class TransportFactory {


    public static Transport getTransport(String transport){

        if(transport.trim().equalsIgnoreCase("Ship")){
            return new Ship();
        }
        else if(transport.trim().equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else {
            return null;
        }
    }
}
