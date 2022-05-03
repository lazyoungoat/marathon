package guide.example.chapter4.constructor;

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(11);
        MyClass t2 = new MyClass(73);

        System.out.println(t1.x + " " + t2.x);
    }
}
