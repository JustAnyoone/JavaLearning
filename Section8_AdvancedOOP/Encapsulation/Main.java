package Section8_AdvancedOOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        // Player player = new Player();
        // player.name = "Tim";
        // player.healt = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(10);
        // System.out.println("Remaining healt = " + player.healtReamining());
        // player.healt = 200; //in public class you can change the variables any moment
        // player.loseHealth(11); 
        // System.out.println("Reamining health = " + player.healtReamining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healtReamining());
    }
}
