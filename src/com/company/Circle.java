package com.company;

public class Circle extends Shape {
    double radius;

    public void draw() {
        System.out.println("Круг");
    }

    @Override
    public void name(String name) {
        this.name=name;
    }

    @Override
    protected void setCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    protected void setColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    protected void setBorderColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    @Override
    public void setScale(int sizeScale) {
        this.sizeScale = sizeScale;
    }

    @Override
    public void setBorderWidth(int sizeBorderWidth) {
        this.sizeBorderWidth = sizeBorderWidth;

    }
}
