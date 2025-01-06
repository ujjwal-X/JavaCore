package designpattern.abstractfactory.vehical.factory;

import designpattern.abstractfactory.vehical.Bike;
import designpattern.abstractfactory.vehical.Car;
import designpattern.abstractfactory.vehical.VehicleFactory;
import designpattern.abstractfactory.vehical.products.HyundaiBike;
import designpattern.abstractfactory.vehical.products.HyundaiCar;

public class HyundaiFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new HyundaiCar();
    }

    @Override
    public Bike createBike() {
        return new HyundaiBike();
    }
}
