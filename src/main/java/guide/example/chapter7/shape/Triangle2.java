package guide.example.chapter7.shape;

public class Triangle2 extends TwoDShape2 {
    String style;

    double area(){
        return getWidth() * getHeight() /2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }

}
