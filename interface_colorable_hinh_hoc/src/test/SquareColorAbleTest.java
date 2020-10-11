package test;

import shape.Square;

public class SquareColorAbleTest {
    public static void main(String[] args) {
        Square[] squares = new Square[10];
        for (int i = 0; i < squares.length; i++) {
            //random side 20->30
            double side = (int) (Math.random() * 11) + 20;
            boolean colorAble = false;
            if(side <= 25){
                colorAble = true;
            }
            squares[i] = new Square(side,colorAble);
            System.out.println("Square "+i+" Area = "+squares[i].getArea());
            squares[i].howToColor();
        }
    }
}
