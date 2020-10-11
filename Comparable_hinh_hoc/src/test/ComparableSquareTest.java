package test;


import comparable.ComparableSquare;

import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] square = new ComparableSquare[3];
        square[0] = new ComparableSquare();
        square[1] = new ComparableSquare(5.6);
        square[2] = new ComparableSquare(4.5,"grey",false);

        System.out.println("Pre-sorted:");
        for (ComparableSquare s: square){
            System.out.println(s.toString());
        }

        Arrays.sort(square);
        System.out.println("After-sorted:");
        for (ComparableSquare s: square){
            System.out.println(s.toString());
        }
    }
}
