package reSizeAble;

import interfacePack.Interface_Resizeable;
import shape.Rectangle;

public class ResizeRectangle implements Interface_Resizeable<Rectangle> {

    @Override
    public void resize(double percent, Rectangle r) {
        r.setLength(r.getLength()*(100+percent)/100);
        r.setWidth(r.getWidth()*(100+percent)/100);
    }

}
