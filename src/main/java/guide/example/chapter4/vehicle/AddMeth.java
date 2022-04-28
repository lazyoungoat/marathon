package guide.example.chapter4.vehicle;

public class AddMeth {
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


        System.out.println("Minivan can carry " + minivan.passengers );
        minivan.range();

        System.out.println("Sportscar can carry " + sportscar.passengers);
        sportscar.range(); // display range by utilise the method range() in Vehicle
















    }
}
