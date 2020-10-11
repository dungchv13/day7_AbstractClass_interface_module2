package comparable;

import shape.Square;
//so sanh theo do dai canh
public class ComparableSquare extends Square implements Comparable<Square>  {
    @Override
    public int compareTo(Square s){
        if (getSide() > s.getSide()) return 1;
        else if (getSide() < s.getSide()) return -1;
        else return 1;
    }
    // contructor
    public ComparableSquare(){}

    public ComparableSquare(double side){
        super(side);
    }
    public ComparableSquare(double side, String color, boolean filled){
        super(side, color, filled);
    }
}
