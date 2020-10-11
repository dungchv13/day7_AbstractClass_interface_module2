package test;

import reSizeAble.ResizeSquare;
import shape.Square;

public class ResizeSquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[5];
        for(int i = 0;i < squares.length;i++){
            // random side 15->25
            double side = (int)(Math.random()*11)+15;

            squares[i] = new Square(side);
        }

        ResizeSquare resizeSquare = new ResizeSquare();

        for (int i = 0; i < squares.length; i++) {
            //random percent 1->100
            double percent = (int)(Math.random() * 100) + 1;

            System.out.println("//square"+(i+1));
            System.out.println("pre-resize:");
            System.out.println("squareSide: "+squares[i].getSide());
            System.out.println("squareArea: "+squares[i].getArea());

            resizeSquare.resize(percent,squares[i]);

            System.out.println("after-resize:");
            System.out.println("squareSide: "+squares[i].getSide());
            System.out.println("squareArea: "+squares[i].getArea());
        }
    }
}
