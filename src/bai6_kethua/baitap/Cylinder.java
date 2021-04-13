package bai6_kethua.baitap;

public class Cylinder extends Circle{
    public double height = 5;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getArea() {
        return super.getPreimeter() * this.height + super.getArea() * 2;
    }

    public String display() {
        return getRadius() + "" + getHeight() + "";
    }
}
