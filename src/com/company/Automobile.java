package com.company;

/**
 * Created by dpennebacker on 10/9/16.
 */
public class Automobile {
    private int mpg;
    private double gallons = 0;

    public Automobile(int m) {
        mpg = m;
    }

    public void fillUp(double fill) {
        gallons = gallons + fill;
    }

    public void takeTrip(double take) {
        gallons = gallons - take / mpg;
    }

    public double reportFuel() {
        return gallons;
    }
}
