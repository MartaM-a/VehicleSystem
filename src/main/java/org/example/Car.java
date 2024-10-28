package org.example;

public abstract class Car implements Vehicle {

    protected double speed;

    @Override
    public void driving() {

        System.out.println("Car is driving");
    }

    @Override
    public void readSpeed(double speed) {
        if (speed <= 0 || speed >= 200) {
            throw new IllegalArgumentException("Speed is out of range");

        }
        this.speed = speed;
    }


    @Override
    public double convertToKmph() {
        return speed;

    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public double convertToMph() {
        return speed * 0.621371;
    }


    @Override
    public double slowDown() {
        double s = speed - 1;
        if (s <= 0) throw new IllegalArgumentException("Speed can`t be O or negative");
        speed = s;
        return speed;

    }

    @Override
    public double speedUp() {

        double s = speed + 10;

        if (s >= 200) throw new IllegalArgumentException("Speed is to high");
        speed = s;
        return speed;
    }




    }



