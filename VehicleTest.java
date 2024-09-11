package com.vehicle.test;

    import com.vehicle.Car;
    import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {
        Car Yarus=new Car();
        ElectricCar Tesla=new ElectricCar();
        Yarus.setSpeedKph(110);
        Yarus.setFuelLevel(50);
        Yarus.drive(13500);
        Tesla.setBatteryLevel(88);
        Tesla.drive(10600);
        Tesla.setSpeedKph(160);
        System.out.println("Yarus Speed: " + Yarus.getSpeedMph());
        /*
        System.out.println(Yarus.getSpeedMph());

        */
        System.out.println("Distance covered by Yarus(Km): " + Yarus.getDistanceKm());
        System.out.println("Fuel left (Ltrs): " + Yarus.calculateRemainingFuel(Yarus.getDistanceKm()));

        System.out.println("Tesla Speed: " + Tesla.getSpeedMph());
        System.out.println("Distance covered by Tesla(Km): " + Tesla.getDistanceKm());

    }
}
