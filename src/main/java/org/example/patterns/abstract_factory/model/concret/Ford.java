package org.example.patterns.abstract_factory.model.concret;

import org.example.patterns.abstract_factory.model.base.SedanCar;

public class Ford implements SedanCar {

    @Override
    public void typeOfCar() {
        System.out.println(this.getClass().getSimpleName() + " is of type sedan car");

    }
}
