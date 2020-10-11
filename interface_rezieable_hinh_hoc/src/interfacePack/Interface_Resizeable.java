package interfacePack;

import shape.Shape;

public interface Interface_Resizeable<X extends Shape> {
    void resize(double percent,X a);
}
