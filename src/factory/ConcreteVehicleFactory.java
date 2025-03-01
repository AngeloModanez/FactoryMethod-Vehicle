package factory;

import factory.car.Car;
import factory.motorcycle.Motorcycle;
import factory.truck.Truck;

public class ConcreteVehicleFactory implements VehicleFactory {
    
    @Override
    public Vehicle createVehicle(String Vehicle) {
        switch (Vehicle){
            case "Car":
                return new Car();
            case "Truck":
                return new Truck();
            case "Motorcycle":
                return new Motorcycle();
            default:
                System.out.println(Vehicle + "Can not be created!");
                return null;
        }
    }
}
