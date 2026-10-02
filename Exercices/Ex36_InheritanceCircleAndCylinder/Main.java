package Exercices.Ex36_InheritanceCircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.printf("Circle.area = %.2f %n" , circle.getArea());
        System.out.println("Circle.Radius = " + circle.getRadius());
        System.out.println();

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.printf("cylinder.area = %.2f %n", cylinder.getArea());
        System.out.printf("cylinder.volume = %.2f %n", cylinder.getVolume());
    }
}
