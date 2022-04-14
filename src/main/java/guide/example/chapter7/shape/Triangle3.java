package guide.example.chapter7.shape;

public class Triangle3  extends TwoDShape2{

    private String style;
    //constructors
    Triangle3 (String s, double w , double h){
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area(){
        return getWidth() * getHeight() /2;

    }
        void showStyle(){
            System.out.println("Triangle is " + style);
        }
}
