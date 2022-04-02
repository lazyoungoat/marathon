package guide.example.chapter1;

public class BlockDemo {
    public static void main(String[] args) {

        int w, v, h;
        w = 22;
        h = 41;
        v = 0;
        if (w < h){
            v = w*h;
            w=0;
        }
        System.out.println("v equals to " + v + ", " + "w equals to " + w);
    }
}
