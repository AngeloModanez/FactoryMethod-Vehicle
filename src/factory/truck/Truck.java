package factory.truck;

import factory.Vehicle;

public class Truck implements Vehicle{
    @Override
    public void product(int qtdWheels, float productionValue) {
        System.out.println("Caminhão com " + qtdWheels + " rodas, e com valor de produção de: R$ " + productionValue);
    }
}
