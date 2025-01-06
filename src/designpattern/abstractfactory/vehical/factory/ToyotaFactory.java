package designpattern.abstractfactory.vehical.factory;

import designpattern.abstractfactory.vehical.Bike;
import designpattern.abstractfactory.vehical.Car;
import designpattern.abstractfactory.vehical.VehicleFactory;
import designpattern.abstractfactory.vehical.products.ToyotaBike;
import designpattern.abstractfactory.vehical.products.ToyotaCar;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ToyotaCar();
    }

    @Override
    public Bike createBike() {
        return new ToyotaBike();
    }
}
