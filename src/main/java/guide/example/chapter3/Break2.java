package guide.example.chapter3;

public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException{
        // break the infinite loop
        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read();
            if (ch == 'q') break;
        }
        System.out.println("You pressed q!");





    }
}
