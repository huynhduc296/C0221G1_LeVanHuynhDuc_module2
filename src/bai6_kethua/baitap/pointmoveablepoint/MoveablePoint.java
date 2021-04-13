package bai6_kethua.baitap.pointmoveablepoint;

public class MoveablePoint extends Point {
        private float xSpeen = 0.0f;
        private float ySpeen = 0.0f;

        public MoveablePoint(float x, float y, float xSpeen, float ySpeen) {
            super(x, y);
            this.xSpeen = xSpeen;
            this.ySpeen = ySpeen;
        }

        public MoveablePoint() {

        }

        public float getxSpeen() {
            return xSpeen;
        }

        public void setxSpeen(float xSpeen) {
            this.xSpeen = xSpeen;
        }

        public float getySpeen() {
            return ySpeen;
        }

        public void setySpeen(float ySpeen) {
            this.ySpeen = ySpeen;
        }

        public float[] getXspeenYspeen() {
            float arr1[] = {this.xSpeen, this.ySpeen};
            return arr1;
        }
        public void setXY(float xSpeen,float ySpeen){
            this.xSpeen=xSpeen;
            this.ySpeen=ySpeen;
        }
        public String toString(){
            return "("+super.getX()+" "+super.getY()+" "+this.xSpeen+","+this.ySpeen+")";
        }
        public MoveablePoint move(){
            super.setX(getX()+this.xSpeen);
            super.setY(getY()+this.ySpeen);
            return this;
        }
}
