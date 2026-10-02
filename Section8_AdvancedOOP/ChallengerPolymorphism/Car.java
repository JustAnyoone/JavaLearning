package Section8_AdvancedOOP.ChallengerPolymorphism;

public class Car {

    protected String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {    
        System.out.printf("GasPoweredCar -> All %d cylinders are fired up, Ready!%n", cylinders);
    } 

    @Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar -> Usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
 
}

class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int baterrySize;

    public ElectricCar(String description, double avgKmPerCharge, int baterrySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.baterrySize = baterrySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Eletric Car -> The level of the battery is %d", baterrySize);
    } 

    @Override
    protected void runEngine() {
        System.out.printf("Eletric Car -> Usage exceeds the average: %.2f %n", avgKmPerCharge);  
    }


}

class HybridCar extends Car {

    private double avgKmPerLitre;
    private int baterrySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int baterrySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.baterrySize = baterrySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {        
        System.out.printf("GasPoweredCar -> All %d cylinders are fired up, Ready!%n", cylinders);
        System.out.printf("Hybrid Car -> The level of the battery is %d", baterrySize);
    } 

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid Car -> Usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

}
