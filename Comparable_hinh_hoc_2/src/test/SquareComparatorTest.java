package test;

import compare.SquareComparator;
import shape.Square;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(8.9);
        squares[2] = new Square(5.6,"green",false);

        System.out.println("Pre-sorted:");
        for(Square s: squares){
            System.out.println(s.toString());
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("After-sorted:");
        for (Square s: squares){
            System.out.println(s.toString());
        }


    }
}
