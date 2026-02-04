package com.example.objectstest;

import java.io.Serializable;

public class  IntakeInfo implements Serializable {
    private int shape;
    private boolean perimeter;
    public IntakeInfo(int shape,boolean perimeter)
    {
        this.shape=shape;
        this.perimeter=perimeter;
    }

    public int getShape() {
        return shape;
    }
    public boolean getperimeter()
    {return perimeter;}

}
