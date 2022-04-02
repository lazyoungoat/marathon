package guide.example.chapter1;

public class GalToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;
        liters = 20;
        gallons = liters/3.7854;

        System.out.println(liters + " liters is " + gallons + " gallons.");

        gallons = 23;
        liters = gallons*3.7854;

        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
