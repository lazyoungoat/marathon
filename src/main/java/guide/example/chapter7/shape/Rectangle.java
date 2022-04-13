package guide.example.chapter7.shape;

public class Rectangle extends TwoDShape{
    boolean isSquare(){
        if (height == width) return true;
        return false;
        // can be simplified as follows: return width == height;
    }
    double area(){
        return width * height;
    }
}
