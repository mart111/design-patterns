package org.example.patterns.decorator;

import org.example.patterns.decorator.component.Car;
import org.example.patterns.decorator.component.Ford;
import org.example.patterns.decorator.component.Toyota;

public class AppDecorator {

    public static void main(String[] args) {

        Car ford = new Ford(260);
        Car toyota = new Toyota(240);
        BoostDecorator b1 = new NitrousOxideBooster(ford);
        BoostDecorator b2 = new NitrousOxideBooster(toyota);
        System.out.println("Before chip tuning");
        ford.printSpeed();
        toyota.printSpeed();
        System.out.println("After chip tuning");
        b1.setSpeed(42);
        b2.setSpeed(42);
        ford.printSpeed();
        toyota.printSpeed();

    }
}
