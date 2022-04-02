package guide.example.chapter2;

public class ScopeDemo {
    public static void main(String[] args) {
        {
            int y = 44;
            System.out.println(y);
        }
//        System.out.println(y);
    }
}
