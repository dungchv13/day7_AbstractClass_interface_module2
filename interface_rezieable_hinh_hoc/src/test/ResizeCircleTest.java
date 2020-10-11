package test;

import reSizeAble.ResizeCircle;
import shape.Circle;

public class ResizeCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        for(int i = 0;i < circles.length;i++){
            //random radius 5->20
            double r = (int) (Math.random() * 16) + 5;
            circles[i] = new Circle(r);
        }
        ResizeCircle resizeCircle = new ResizeCircle();
        int i = 1;
        for (Circle c: circles){
            //random percent 1->100
            double percent = (int)(Math.random() * 100) + 1;

            System.out.println("circle"+i);
            System.out.println("pre-resize:");
            System.out.println("circleRadius: "+c.getRadius());
            System.out.println("circleArea: "+c.getArea());

            resizeCircle.resize(percent,c);

            System.out.println("after-resize:"+percent+" %");
            System.out.println("circleRadius: "+c.getRadius());
            System.out.println("circleArea: "+c.getArea());
            i++;
        }
    }
}
