package bai7abstractclassinterface.baitap.conlorable;

import bai7abstractclassinterface.baitap.reasizeable.Shape;

public class Test {
    public static void main(String[] args) {
        Shape[] listShape = new Shape[4];
        listShape[0] = new Circle(3);
        listShape[1] = new Square(5);
        listShape[2] = new Square(6);
        listShape[3] = new Circle(4);
        for (int i = 0; i < listShape.length; i++) {
            if (listShape[i] instanceof Square) {
                Square shape = (Square) listShape[i];
                System.out.print("Area: " + shape.getArea() + "---");
                shape.howToColor();
            } else {
                Circle shape = (Circle) listShape[i];
                System.out.println("Area: " + shape.getArea());
            }
        }
    }
}
