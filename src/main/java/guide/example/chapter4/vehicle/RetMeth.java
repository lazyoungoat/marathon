package guide.example.chapter4.vehicle;

public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // assign values to fields in minivan
        minivan.fuelcap = 11;
        minivan.mpg = 11;
        minivan.passengers = 4;

        // assign values to fields in sportscar
        sportscar.fuelcap = 12;
        sportscar.mpg = 13;
        sportscar.passengers = 1;


        // get the ranges
        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");


        System.out.println("Sportscar can carry " + sportscar.passengers  + " with range of " + range2 + " Miles");
















    }
}
