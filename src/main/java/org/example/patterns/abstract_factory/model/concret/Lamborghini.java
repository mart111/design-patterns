package org.example.patterns.abstract_factory.model.concret;

import org.example.patterns.abstract_factory.model.base.SportCar;

public class Lamborghini implements SportCar {

    @Override
    public void typeOfCar() {
        System.out.println(this.getClass().getSimpleName() + " is of type sport car");
    }
}
