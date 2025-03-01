package factory.motorcycle;

import factory.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void product(int qtdWheels, float productionValue) {
        System.out.println("Moto com " + qtdWheels + " rodas, e com valor de produção de: R$ " + productionValue);
    }
}
