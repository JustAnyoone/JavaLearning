package Exercices.Ex37_CuboidPoolAreaCalculation;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double widht, double lenght) {
        if (widht < 0.0) {
            this.width = 0.0;
        }
        if (lenght < 0.0) {
            this.length = 0.0;
        }
        
        this.width = widht;
        this.length = lenght;
    }
    
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    public double getArea(){
        return (width * length);
    }
}
