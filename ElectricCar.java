package com.vehicle;

public class ElectricCar extends Car{
    private double batteryLevel;
    public double getBatteryLevel() {
        return batteryLevel;
    }
    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    @Override

    public void drive(int distance) {
        super.drive(distance);
        double distanceKm= ((double) (distance)) /1000;
        int dC=(int)(distanceKm);
        this.batteryLevel=this.batteryLevel*(100-dC)/100;
        System.out.println("Battery Level left: " + getBatteryLevel() + "%");
    }
}
