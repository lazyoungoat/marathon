package guide.example.chapter2;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x=10.0;
        y=3.0;

        i = (int) (x/y);//cast double to int
        System.out.println("Integer outcome of x/y: " + i);

        i = 100;
        b = (byte)i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte)i;
        System.out.println("Value of b: " + b);


        b = 88;//ASCII code for X
        System.out.println(b);
        ch = (char)b;
        System.out.println("ch: "+ch);


    }
}
