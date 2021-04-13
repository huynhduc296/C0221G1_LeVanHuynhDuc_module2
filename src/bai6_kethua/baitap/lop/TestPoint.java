package bai6_kethua.baitap.lop;

public class TestPoint {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        System.out.println(point3D.toString());
        point3D=new Point3D(1,2,3);
        System.out.println(point3D.toString());
        point3D.setZ(4);
        System.out.println(point3D.toString());
    }
}
