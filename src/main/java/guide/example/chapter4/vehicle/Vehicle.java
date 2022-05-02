package guide.example.chapter4.vehicle;

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    int range(){
        return mpg * fuelcap;
    }

    double fuelNeeded (int miles){
        return (double) miles/mpg;
    }











    // Display the range
    /*void range(){
        System.out.println("Range is " + fuelcap * mpg);
    }*/

    // range() using return


    /*void myMeth(){
        for (int i = 0; i < 10; i++) {
            if (i==5) return;// stop at 5
            System.out.println(i);
        }*/


































}
