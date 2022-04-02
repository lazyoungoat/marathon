package guide.example.chapter1;

import java.util.Arrays;

public class GalToLitTable {
    public static void main(String[] args) {


        double gallon, liter;
///*
        gallon = 1;
        liter = gallon * 3.7854;
        System.out.println("int:");
        for (int i = 1; i < 101; i++) {
            System.out.println(i + " gallons is " + liter + " liters.");
            if (i%10==0) {
                System.out.println();
            }
        }
//  */
        System.out.println("double:");
        double liters;
        int counter = 0;
        for (double gallons = 1; gallons <= 100; gallons++){
            liters = gallons *3.7854;

            System.out.println(gallons + "gallons is " + liters + " liters.");

        counter++;
        if (counter==10){
            System.out.println();
            counter =0;
        }



        }



    }
}
