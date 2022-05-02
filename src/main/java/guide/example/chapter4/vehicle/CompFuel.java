package guide.example.chapter4.vehicle;

public class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;


        // assign values to fields in minivan
        minivan.fuelcap = 11;
        minivan.mpg = 11;
        minivan.passengers = 4;

        // assign values to fields in sportscar
        sportscar.fuelcap = 12;
        sportscar.mpg = 13;
        sportscar.passengers = 1;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs "+ gallons +"gallons of fuel");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sports car needs "+ gallons +"gallons of fuel");

        System.out.println(sportscar.fuelNeeded(4));













    }
}
