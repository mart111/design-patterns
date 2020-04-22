package org.example.patterns.abstract_factory.factory;

import org.example.patterns.abstract_factory.model.base.SedanCar;

public class SedanCarFactory implements CarFactory {

    @Override
    public SedanCar createCar(Class<?> typeOfCar) throws IllegalAccessException, InstantiationException {
        Object car = typeOfCar.newInstance();
        if (car instanceof SedanCar)
            return ((SedanCar) car);

        throw new InstantiationException("Couldn't provide car of type:  " + typeOfCar);
    }
}
