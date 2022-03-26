package com.syntax.class25;

public class CarTester {
    public static void main(String[] args) {
        //to call both methods, use the car interface
        Car car = new BMW();
        car.drive();
        car.move();
    }
}
