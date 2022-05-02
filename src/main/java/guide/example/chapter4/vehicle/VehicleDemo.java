package guide.example.chapter4.vehicle;

import guide.example.chapter4.vehicle.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {

        // this class declares an object of type Vehicle

        Vehicle minivan = new Vehicle();
        int range;

        // assign values to fields in minivan
        minivan.passengers = 4;
        minivan.fuelcap = 20;
        minivan.mpg = 19;

        // compute the range assuming a full tank of gas
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
















    }
}
