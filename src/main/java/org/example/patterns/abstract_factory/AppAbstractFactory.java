package org.example.patterns.abstract_factory;

import org.example.patterns.abstract_factory.factory.CarFactory;
import org.example.patterns.abstract_factory.factory.SedanCarFactory;
import org.example.patterns.abstract_factory.factory.SportCarFactory;
import org.example.patterns.abstract_factory.model.base.Car;
import org.example.patterns.abstract_factory.model.concret.Ferrari;
import org.example.patterns.abstract_factory.model.concret.Toyota;

public class AppAbstractFactory {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        CarFactory sedanCarFactory = new SedanCarFactory();
        CarFactory sportCarFactory = new SportCarFactory();
        Car toyota = sedanCarFactory.createCar(Toyota.class);
        toyota.typeOfCar();
        Car ferrari = sportCarFactory.createCar(Ferrari.class);
        ferrari.typeOfCar();
    }
}
