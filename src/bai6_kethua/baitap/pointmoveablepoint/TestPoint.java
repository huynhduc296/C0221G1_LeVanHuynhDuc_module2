package bai6_kethua.baitap.pointmoveablepoint;

public class TestPoint {
    public static void main(String[] args) {
        MoveablePoint movablePoint=new MoveablePoint(0,0,3,5);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
