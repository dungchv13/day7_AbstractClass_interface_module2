package comparable;

import shape.Rectangle;

//so sanh theo dien tich
public class ComparableRectangle extends Rectangle implements Comparable<Rectangle> {
    @Override
    public int compareTo(Rectangle r){
        if (getArea() > r.getArea()) return 1;
        else if (getArea() < r.getArea()) return -1;
        else return 1;
    }
    // contructor
    public ComparableRectangle(){}

    public ComparableRectangle(double width,double length){
        super(width,length);
    }

    public ComparableRectangle(double width, double length, String color, boolean filled){
        super(width, length, color, filled);
    }
}