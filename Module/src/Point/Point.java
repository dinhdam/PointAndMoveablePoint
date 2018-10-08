package Point;

public class Point {
    private  float x = 0.0f;
    private  float y = 0.0f;
    public Point(){
    }
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] listXY = new float[2];
        listXY[0] = this.x;
        listXY[1] = this.y;
        return listXY;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y +")";
    }
}
