package guide.example.chapter2;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x, y;

        x = 2;
        System.out.println("x is " + x);

        y = x++;
        System.out.println("x is " + x + ", y is " + y);

        y = ++x;
        System.out.println("x is " + x + ", y is " + y);

        System.out.println(y);


    }
}
