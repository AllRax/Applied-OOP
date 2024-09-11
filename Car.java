package com.vehicle;
    public class Car{
        private double speedKph;
        private float fuelLevel;
        private int distanceTraveled;

        public void setSpeedKph(double speedKph) {
            this.speedKph = speedKph;
        }

        public void setFuelLevel(float fuelLevel) {
            this.fuelLevel = fuelLevel;
        }

        public void drive(int distance) {
            this.distanceTraveled = distance;
        }

        public double getSpeedMph() {
            return speedKph/1.60934;
        }

        public float getFuelLevel() {
            return fuelLevel;
        }

        public int getDistanceKm() {
            return distanceTraveled/1000;
        }
        public int calculateRemainingFuel(double distance){
            distance=(double) getDistanceKm();
            double y;
            if(distance==1){
                y=0.5/100*getFuelLevel();
            }
            else {
                y=((0.5/100)*distance)*getFuelLevel();
            }
            return (int)y;
        }
    }
