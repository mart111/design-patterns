package org.example.patterns.abstract_factory.factory;

import org.example.patterns.abstract_factory.model.base.SportCar;

public class SportCarFactory implements CarFactory {

    @Override
    public SportCar createCar(Class<?> typeOfCar) throws IllegalAccessException, InstantiationException {
        Object car = typeOfCar.newInstance();
        if (car instanceof SportCar)
            return ((SportCar) car);

        throw new InstantiationException("Couldn't provide car of type:  " + typeOfCar);
    }
}
