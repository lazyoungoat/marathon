package guide.example.chapter1;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i = i + 1) {
            System.out.println("i = "+i);
        }
        System.out.println("done!");
        for (int i = 4; i > 0; i--) {
            System.out.println("i = "+i+"(i--)");

        }
        System.out.println("done!");
    }
}
