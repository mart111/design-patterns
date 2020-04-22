package org.example.patterns.decorator;

import org.example.patterns.decorator.component.Car;

public abstract class BoostDecorator implements Car {

    protected Car car;

    protected BoostDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void printSpeed() {
        System.out.println("MAX Speed: " + car.speed());
    }

    public Car getCar() {
        return car;
    }
}
