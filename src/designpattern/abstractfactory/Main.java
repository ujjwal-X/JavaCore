package designpattern.abstractfactory;


import designpattern.abstractfactory.vehical.Bike;
import designpattern.abstractfactory.vehical.Car;
import designpattern.abstractfactory.vehical.VehicleFactory;
import designpattern.abstractfactory.vehical.factory.HyundaiFactory;
import designpattern.abstractfactory.vehical.factory.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        // Create a Hyundai factory
        VehicleFactory hyundaiFactory = new HyundaiFactory();
        Car hyundaiCar = hyundaiFactory.createCar();
        Bike hyundaiBike = hyundaiFactory.createBike();

        hyundaiCar.design();  // Output: Designing a Hyundai Car
        hyundaiBike.design(); // Output: Designing a Hyundai Bike

        // Create a Toyota factory
        VehicleFactory toyotaFactory = new ToyotaFactory();
        Car toyotaCar = toyotaFactory.createCar();
        Bike toyotaBike = toyotaFactory.createBike();

        toyotaCar.design();  // Output: Designing a Toyota Car
        toyotaBike.design(); // Output: Designing a Toyota Bike
    }
}
