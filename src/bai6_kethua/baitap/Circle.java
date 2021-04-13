package bai6_kethua.baitap;

public class Circle {
    private double radius=1;
    private String color="black";

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPreimeter(){
        return  2*Math.PI*radius;
    }
    public String display(){
        return getRadius()+" "+getArea()+" ";
    }
}

