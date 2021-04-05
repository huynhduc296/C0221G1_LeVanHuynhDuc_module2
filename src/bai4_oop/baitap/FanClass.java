package bai4_oop.baitap;

public class FanClass {
    final int Slow=1;
    final int Medium=2;
    final int Fast=3;
    private int speed=Slow;
    private boolean IsOn=false;
    private double radius=5;
    private String color="blue";


    public FanClass(int speed, boolean IsOn, double radius, String color) {
        this.speed = speed;
        this.IsOn = IsOn;
        this.radius = radius;
        this.color = color;
    }

    public FanClass() {
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getIsOn(){
        return this.IsOn;
    }
    public void setIsOn(boolean status){
        this.IsOn=status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (IsOn == true) {
            return "FanClass{" +
                    ", speed=" + speed +
                    ", IsOn=" + IsOn +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "FanClass2{" +
                    ", speed=" + speed +
                    ", IsOn=" + IsOn +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

}
