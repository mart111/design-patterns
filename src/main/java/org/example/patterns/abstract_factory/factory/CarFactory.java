package org.example.patterns.abstract_factory.factory;

import org.example.patterns.abstract_factory.model.base.Car;

public interface CarFactory {
    Car createCar(Class<?> typeOfCar) throws IllegalAccessException, InstantiationException;
}
