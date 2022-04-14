package guide.example.chapter7.shape;

public class Triangle4 extends TwoDShape4{
    private String style;

    // A default constructor.
    Triangle4(){
        super();
        style = "none";
    }


    //constructors
    Triangle4 (String s, double w , double h){
        super(w, h);// call super class constructor
        style = s;
    }

    //One argument constructor.
    Triangle4(double x){
        super(x);// call superclass constructor

        style = "filled";
    }

    double area(){
        return getWidth() * getHeight() /2;

    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
