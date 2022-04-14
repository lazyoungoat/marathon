package guide.example.chapter7.shape;

public class Shapes4 {
    public static void main(String[] args) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);


        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
    }
}