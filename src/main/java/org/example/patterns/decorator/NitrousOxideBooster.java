package org.example.patterns.decorator;

import org.example.patterns.decorator.component.Car;

public class NitrousOxideBooster extends BoostDecorator {


    public NitrousOxideBooster(Car car) {
        super(car);
    }

    @Override
    public int speed() {
        return car.speed();
    }

    @Override
    public void setSpeed(int speed) {
        car.setSpeed(car.speed() + speed);
    }
}
