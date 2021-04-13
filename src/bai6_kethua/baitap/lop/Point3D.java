package bai6_kethua.baitap.lop;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public Point3D(){

    }

    public float[] getXYZ() {
        float arr2[] = {getX(), getY(), this.z};
        return arr2;
    }
    public void setXY(float x,float y ,float z){
        super.setXY(x,y);
        this.z=z;
    }
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+ this.z+")";
    }
}
