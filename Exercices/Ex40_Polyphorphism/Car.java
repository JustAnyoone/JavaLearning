package Ex40_Polyphorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {

        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car's engine is starting.";
    }

    public String accelerate(){
        return "Car is accelerating.";
    }

    public String brake(){
        return "Car -> brake()";
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + "]";
    }

    
}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }

}

class Kia extends Car{

    public Kia(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }
}

class BYD extends Car{

    public BYD(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +  " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +  " -> startEngine()";
    }
}