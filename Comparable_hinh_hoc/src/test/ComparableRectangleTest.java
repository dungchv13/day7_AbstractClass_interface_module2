package test;

import comparable.ComparableRectangle;

import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[3];
        rectangles[0] = new ComparableRectangle();
        rectangles[1] = new ComparableRectangle(15.3,16.8);
        rectangles[2] = new ComparableRectangle(7.4,11.9,"red",true);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle rectangle: rectangles){
            System.out.println(rectangle.toString());
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (ComparableRectangle rectangle: rectangles){
            System.out.println(rectangle.toString());
        }

    }
}
