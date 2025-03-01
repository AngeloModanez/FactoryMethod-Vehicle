package factory.car;

import factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void product(int qtdWheels, float productionValue){
        System.out.println("Carro com " + qtdWheels + " rodas, e com valor de produção de: R$ " + productionValue);
    }
}
