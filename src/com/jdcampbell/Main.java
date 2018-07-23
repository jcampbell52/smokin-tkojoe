package com.jdcampbell;

import Transportation.Car;
import Transportation.Cheverolet;
import Transportation.Vehicle;

public class Main {

    public static void main(String[] args) {
       Cheverolet chevy = new Cheverolet(36);
        chevy.steer(45);
        chevy.accelerate(30);
        chevy.accelerate(20);
        chevy.accelerate(-42);

    }
}
