package guide.example.chapter7.shape;

public class TwoDShape2 {
    private double width;
    private double height;




    //Accessor methods for width and height.
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }


}
