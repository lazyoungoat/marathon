package guide.example.chapter7.shape;

public class TwoDShape4 {
    private double width;
    private double height;

    // a default Constructor
    TwoDShape4(){
        width=height=0;
    }



    // Parameterized constructor.
    TwoDShape4(double w, double h){
        width = w;
        height = h;
    }

    //construct object with equal width and height
    TwoDShape4(double x){
        width=height=x;
    }


    //Accessor methods for width and height.
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }




}
