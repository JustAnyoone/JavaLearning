package Exercices.Ex40_Polyphorphism;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        BYD Byd = new BYD(6, "BYD Seal");
        System.out.println(Byd.startEngine());
        System.out.println(Byd.accelerate());
        System.out.println(Byd.brake());
        
        Kia kia = new Kia(6, "KIA K5");
        System.out.println(kia.startEngine());
        System.out.println(kia.accelerate());
        System.out.println(kia.brake());

    }
}
