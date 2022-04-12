package guide.example;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args)
    throws  java.io.IOException{

        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int num = Integer.parseInt(string);

        insert:
            for (int i = num; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if (num<1)
                        break insert;

                    System.out.print(i + "*" + j +"=" + i*j+"\t");
                }
                System.out.println();
            }

    }


}

