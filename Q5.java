package com.company;

public class Q5 {

    public int gear;
    private double speed;
    private String brand;

    public Car(int startGear) {
        this.gear = startGear;
    }

    public Car(int gear, double speed, String brand) {
        this.gear = gear;
        this.speed = speed;
        this.brand = brand;
    }

    protected boolean isRide(){
        return false;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double speedUp(double increment) {
        speed += increment;
        return  speed;
    }

    private double applyBrake(double decrement) {
        speed -= decrement;
        return speed;
    }

}

class RacingCar extends Car {

    public RacingCar(int startGear) {
        super(startGear);
    }

    @Override
    public double speedUp(double increment) {
        return speedUp(increment)*2;
    }
}

class TestClass {
    public static void main(String[] args) {
        RacingCar racingCar = new RacingCar(5);
    }
}