package guide.example.chapter4.vehicle;

public class VehConsDemo {
    public static void main(String[] args) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(11, 11, 4 );
        Vehicle sportscar = new Vehicle(12, 13, 3);
        double gallons;
        int dist = 222;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sports car needs " + gallons + " gallons of fuel.");



    }
}
