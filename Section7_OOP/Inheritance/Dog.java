package Section7_OOP.Inheritance;
public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        // super(); // a way to call a constructor on the super class directly
        super("Mutt","big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape +
            ", tailShape=" + tailShape +
            ", toString()="
            + super.toString() + "]";
    }

    public void makeNoise(){ //Overriding create a method on a subclass, which has the same signature as a method on a super class    
        if (type == "Wolf") {
            System.out.println("Ow Woooooooooo!");
        }
         bark();
         System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
    
    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog Running ");
    }

    private void walk(){
        System.out.println("Dog Walking ");
    }

    private void wagTail(){
        System.out.println("Tail Wagging");
    }
}
