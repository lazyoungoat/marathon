package guide.example.chapter3;

public class ContToLabel {
    public static void main(String[] args) {
        // Use continue with a label

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j==5) continue outerloop; // continue outer loop
                System.out.print(j);
            }




        }





    }
}
