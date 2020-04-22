package org.example.patterns.decorator.component;

public class Ford implements Car {

    private int speed;

    public Ford(int initialSpeed) {
        this.speed = initialSpeed;
    }

    @Override
    public void printSpeed() {
        System.out.println("MAX Speed: " + this.speed());
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
