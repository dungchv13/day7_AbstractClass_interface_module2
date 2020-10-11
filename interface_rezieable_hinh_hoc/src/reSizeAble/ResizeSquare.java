package reSizeAble;
import interfacePack.Interface_Resizeable;
import shape.Square;


public class ResizeSquare implements Interface_Resizeable<Square> {
    @Override
    public void resize(double percent, Square a) {
        a.setSide(a.getSide()*(100+percent)/100);
    }


}
