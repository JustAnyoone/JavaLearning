package Section7_OOP.ClassesPart1;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.setMake("Maserati"); //<- Unknown
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        // car.model = "Carrera"; <-- private in Car
        // car.color = "Red"; <-- private in Car
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche"); //<- Unknown
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
