import Point.Point;

public class MoveablePoint extends Point {
    private float Xspeed = 0.0f;
    private float Yspeed = 0.0f;
    public MoveablePoint (){
    }
    public MoveablePoint(float Xspeed,float Yspeed){
        this.Xspeed = Xspeed;
        this.Yspeed = Yspeed;
    }
    public MoveablePoint (float X,float Y,float Xspeed,float Yspeed){
        super(X,Y);
        this.Xspeed = Xspeed;
        this.Yspeed = Yspeed;

    }

    public float getXspeed() {
        return Xspeed;
    }

    public void setXspeed(float xspeed) {
        Xspeed = xspeed;
    }

    public float getYspeed() {
        return Yspeed;
    }

    public void setYspeed(float yspeed) {
        Yspeed = yspeed;
    }
    public float[] getSpeed(){
        float[] speed = new float[2];
        speed[0] = this.Xspeed;
        speed[1] = this.Yspeed;
        return speed;
    }

    public String move(){
        return "New position is: " + (super.getX() + this.Xspeed) + "," + (super.getY() + this.Yspeed);
    }

    @Override
    public String toString(){
        return "(" + super.getX() + "," + super.getY() +"), speed =(" + this.Xspeed + "," + this.Yspeed + ")";
    }
}
