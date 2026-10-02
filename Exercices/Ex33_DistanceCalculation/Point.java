package Exercices.Ex33_DistanceCalculation;

public class Point {

    private int x;
    private int y;
    
    public Point() { 
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(Point other) {
        return distance(other.x, other.y);
    }

    public double distance(int x, int y){

        double dx = x - this.x; //<- ditance(x) - (6)
        double dy = y - this.y; //<- ditance(y) - ( 5)
        return Math.sqrt(dx * dx + dy * dy);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
