package test;

import reSizeAble.ResizeRectangle;
import shape.Rectangle;

public class ResizeRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        for(int i = 0;i < rectangles.length;i++){
            //random width 10->20
            double width = (int) (Math.random()*11)+10;
            //random length 20->25
            double length = (int) (Math.random()*6)+20;

            rectangles[i] = new Rectangle(width,length);
        }

        ResizeRectangle resizeRectangle = new ResizeRectangle();

        for(int i = 0;i < rectangles.length;i++){
            //random percent 1->100
            double percent = (int)(Math.random() * 100) + 1;

            System.out.println("//rectangle"+(i+1));
            System.out.println("pre-resize:");
            System.out.println("rectangleWidth: "+rectangles[i].getWidth());
            System.out.println("rectangleLength: "+rectangles[i].getLength());
            System.out.println("rectangleArea: "+rectangles[i].getArea());

            resizeRectangle.resize(percent,rectangles[i]);

            System.out.println("after-resize: "+percent+" %");
            System.out.println("rectangleWidth: "+rectangles[i].getWidth());
            System.out.println("rectangleLength: "+rectangles[i].getLength());
            System.out.println("rectangleArea: "+rectangles[i].getArea());
        }

    }
}
