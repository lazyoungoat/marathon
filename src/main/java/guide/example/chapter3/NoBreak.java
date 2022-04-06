package guide.example.chapter3;

public class NoBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
            }
            System.out.println();

        }
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 1, 2 or 3");
                    break;
                case 4:
                    System.out.println("i is 4\n");
                    break;
            }
        }
        char ch1 = 'A';
        char ch2 = 'A';
        switch (ch1){
            case 'A':
                System.out.println("This A is part of outer switch.");
                switch (ch2){
                    case 'A':
                        System.out.println("This A is part of inner switch");
                        break;
                    case 'B': // ...
                }// end of inner switch
                break;
            case 'B': // ...

        }
    }
}
