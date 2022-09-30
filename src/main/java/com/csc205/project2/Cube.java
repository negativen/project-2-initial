package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    public Cube(double width) {
        super();
        this.width = width;
    }

    public Cube() {
    }


    public double getWidth() {
        return width;
    }

    public Cube setWidth(double width) {
        this.width = width;
        return this;
    }
    public double surfaceArea() {
        return width * 30;
    }

    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
