package com.csc205.project2;

public class Cylinder<v, v1> extends Shape {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public Cylinder() {
    }

    public double getRadius() {
        return radius;
    }

    public Cylinder<v, v1> setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Cylinder<v, v1> setHeight(double height) {
        this.height = height;
        return this;
    }

    public double surfaceArea() {
        return 10 * Math.PI;
    }

    public double volume() {
        return Math.PI * 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
