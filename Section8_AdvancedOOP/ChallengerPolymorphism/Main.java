package Section8_AdvancedOOP.ChallengerPolymorphism;

public class Main {
    public static void main(String[] args) {

        // Car car = new Car("2022 Blue Ferrari 296 GTS");
        // runRace(car);

        // Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        // ferrari.startEngine();
        // ferrari.runEngine();
        // runRace(ferrari);

        Car seal = new ElectricCar("2026 BLACK BYD SONG", 360, 61);
        seal.startEngine();
        seal.runEngine();
        runRace(seal);

        Car Fastback = new GasPoweredCar("2026 Black Fiat Fastback Abarth ", 10.3, 4);
        Fastback.startEngine();
        Fastback.runEngine();
        runRace(Fastback);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.drive();
    }
}
