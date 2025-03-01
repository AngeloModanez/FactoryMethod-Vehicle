package main;

import factory.ConcreteVehicleFactory;
import factory.Vehicle;
import factory.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle car = factory.createVehicle("Car");
        car.product(4, 35000);

        Vehicle truck = factory.createVehicle("Truck");
        truck.product(6, 50000);

        Vehicle motorcycle = factory.createVehicle("Motorcycle");
        motorcycle.product(2, 25000);
    }
}
