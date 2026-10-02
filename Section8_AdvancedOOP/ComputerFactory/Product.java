package Section8_AdvancedOOP.ComputerFactory;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product [model=" + model + ", manufacturer=" + manufacturer + ", width=" + width + ", height=" + height
                + ", depth=" + depth + "]";
    }
    
}

class Monitor extends Product {

    private int size;
    private String resolutaion;
    
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolutaion) {
        super(model, manufacturer);
        this.size = size;
        this.resolutaion = resolutaion;
    }

    @Override
    public String toString() {
        return "Monitor [size=" + size + ", resolutaion=" + resolutaion + "]";
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d,%d in color %s", x, y, color));
    }
    
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;
    
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    @Override
    public String toString() {
        return "Motherboard [ramSlots=" + ramSlots + ", cardSlots=" + cardSlots + ", bios=" + bios + "]";
    }

    public void loadProgram(String programName) {
        System.out.println("Program" + programName + " is now loading...");
    }


}

class ComputerCase extends Product {

    private String powerSuply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSuply) {
        super(model, manufacturer);
        this.powerSuply = powerSuply;
    }

    @Override
    public String toString() {
        return "ComputerCase [powerSuply=" + powerSuply + "]";
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}