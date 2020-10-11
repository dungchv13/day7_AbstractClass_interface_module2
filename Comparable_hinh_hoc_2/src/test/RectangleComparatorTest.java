package test;


import compare.RectangleComparator;
import shape.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangle = new Rectangle[3];
        rectangle[0] = new Rectangle();
        rectangle[1] = new Rectangle(9.8,11.9);
        rectangle[2] = new Rectangle(4.5,5.6,"grey",true);

        System.out.println("Pre-sorted:");
        for (Rectangle r : rectangle) {
            System.out.println(r.toString());
        }
        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangle,rectangleComparator);

        System.out.println("After-sorted:");
        for (Rectangle r : rectangle) {
            System.out.println(r.toString());
        }
    }
}
