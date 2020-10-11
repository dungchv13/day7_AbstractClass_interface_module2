package shape;

import interfacePack.ColorAble;

public class Square extends Rectangle implements ColorAble {
    private boolean colorAble;
    //contructor
    public Square() {}

    public Square(double side,boolean colorAble){
        this.setSide(side);
        this.setColorAble(colorAble);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    //GET SET


    public boolean isColorAble() {
        return colorAble;
    }

    public void setColorAble(boolean colorAble) {
        this.colorAble = colorAble;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        if(this.isColorAble()){
            System.out.println("Color all four sides.");
        }else{
            System.out.println("Can't color this Square");
        }
    }
}
