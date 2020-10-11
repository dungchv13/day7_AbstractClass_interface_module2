package reSizeAble;

import interfacePack.Interface_Resizeable;
import shape.Circle;

public class ResizeCircle implements Interface_Resizeable<Circle> {
    @Override
    public void resize(double percent,Circle c){
        c.setRadius(c.getRadius()*(100+percent)/100);
    }
}
